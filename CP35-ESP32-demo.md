# ESP32 与 CP35 BLE 信标连接与基础测距 Demo

本项目演示如何使用 ESP32 扫描 CP35 低功耗蓝牙（BLE）信标，捕获其广播信号，获取实时信号强度（RSSI），并利用对数路径损耗模型计算 ESP32 与 CP35 之间的相对距离。

---

## 1. 软件与版本

| 项目 / 工具 | 版本 / 说明 |
| :--- | :--- |
| **开发环境 (IDE)** | Arduino IDE 2.x |
| **ESP32 开发板扩展包** | `esp32 by Espressif Systems` **v3.1.2** (或 v3.x 系列) |
| **开发板选择** | `ESP32 Dev Module` |
| **使用的库** | 官方自带 BLE 库 (`BLEDevice`, `BLEScan`, `BLEUtils`)，无需额外安装第三方库 |
| **串口工具** | CH340 / CP2102 驱动，串口监视器波特率设置为 `115200 baud` |

---

## 2. 示例代码

在项目中新建 `Beacon.ino` 文件，并写入以下基础示例代码：

```cpp
#include <Arduino.h>
#include <BLEDevice.h>
#include <BLEUtils.h>
#include <BLEScan.h>
#include <BLEAdvertisedDevice.h>
#include <math.h>

// ==========================================
// 配置项：替换为你的 CP35 的 MAC 地址（小写）
// ==========================================
#define TARGET_MAC "48:87:2d:77:61:67"

// 测距参数设置（标定值）
#define A_VALUE -59.0  // CP35 在距离 1 米时的标准 RSSI
#define N_VALUE 2.0    // 路径损耗指数（自由空间通常为 2.0，室内一般为 2.0 ~ 3.5）

// 根据 RSSI 计算对数路径损耗距离（米）
float calculateDistance(int rssi) {
    if (rssi == 0) return -1.0;
    float power = (A_VALUE - rssi) / (10.0 * N_VALUE);
    return pow(10.0, power);
}

// BLE 扫描回调类
class MyAdvertisedDeviceCallbacks : public BLEAdvertisedDeviceCallbacks {
    void onResult(BLEAdvertisedDevice advertisedDevice) override {
        String currentAddress = advertisedDevice.getAddress().toString().c_str();

        // 匹配目标 CP35 的 MAC 地址
        if (currentAddress.equalsIgnoreCase(TARGET_MAC)) {
            int rssi = advertisedDevice.getRSSI(); // 获取信号强度 RSSI
            float distance = calculateDistance(rssi); // 计算相对距离

            // 输出结果到串口
            Serial.printf("MAC: %s | RSSI: %d dBm | 估算距离: %.2f 米\n",
                          currentAddress.c_str(),
                          rssi,
                          distance);
        }
    }
};

BLEScan* pBLEScan;

void setup() {
    Serial.begin(115200);
    delay(1000); // 预留串口准备时间

    Serial.println("====================================");
    Serial.println("启动 ESP32 BLE 扫描并获取 CP35 信号值与距离...");
    Serial.println("====================================");

    BLEDevice::init("");
    pBLEScan = BLEDevice::getScan();
    pBLEScan->setAdvertisedDeviceCallbacks(new MyAdvertisedDeviceCallbacks());
    pBLEScan->setActiveScan(true);  // 主动扫描模式
    pBLEScan->setInterval(100);     // 扫描间隔 (ms)
    pBLEScan->setWindow(99);        // 扫描窗口 (ms)
}

void loop() {
    // 每次持续扫描 2 秒
    pBLEScan->start(2, false);
    pBLEScan->clearResults();
}
```

---

## 3. 教程

### 步骤一：配置开发环境
1. 打开 **Arduino IDE**。
2. 进入左侧 `Boards Manager`，搜索 `esp32`，确保已安装 `esp32 by Espressif Systems`（版本 `3.1.2`）。
3. 在顶部菜单栏选择开发板为 **`ESP32 Dev Module`**，并选择正确的串口（COM 口）。
   <img width="1754" height="896" alt="ScreenShot_2026-09-02_173648_314" src="https://github.com/user-attachments/assets/05a97ff9-b07a-46fb-a67c-ed9ef4ba33d8" />
   <img width="1508" height="835" alt="ScreenShot_2026-09-02_173423_583" src="https://github.com/user-attachments/assets/e4b56412-495b-46c9-ac98-5847a34093e6" />
   <img width="1614" height="881" alt="e6cb940c07580eff758bb0907f7dcfce" src="https://github.com/user-attachments/assets/39b4dbf4-866f-4240-907d-a451821a605b" />



### 步骤二：确认与修改参数
1. **修改 MAC 地址**：将代码中的 `#define TARGET_MAC "48:87:2d:77:61:67"` 替换为你实际 CP35 信标的 MAC 地址。
2. **标定 1 米信号强度 ($A$ 值)**：将 CP35 放在距离 ESP32 **1 米** 处，观察输出的平均 RSSI 值，将其更新至 `#define A_VALUE`。
  

   

### 步骤三：编译与烧录
1. 点击左上角的 **`√` (Verify)** 检查并编译代码。
2. 点击 **`→` (Upload)** 将程序烧录至 ESP32 开发板。
3. 如果烧录时显示 `Connecting...`，按住 ESP32 开发板上的 **`BOOT`** 键直至开始下载进度条。

### 步骤四：查看串口数据
1. 烧录完成，控制台显示 `Done uploading` 后，点击右上角的 **Serial Monitor（串口监视器）** 图标。
2. 在串口监视器右侧的波特率下拉菜单中，选择 **`115200 baud`**。
3. 确保 CP35 设备处于正常供电与广播状态。
4. 串口监视器将实时打印捕捉到的 RSSI 信号值与对应估算的距离：
   ```text
   MAC: 48:87:2d:77:61:67 | RSSI: -58 dBm | 估算距离: 0.89 米
   MAC: 48:87:2d:77:61:67 | RSSI: -63 dBm | 估算距离: 1.58 米
   ```
   <img width="1848" height="1004" alt="ScreenShot_2026-09-02_173521_246" src="https://github.com/user-attachments/assets/34898e3f-9507-4f7e-863c-d10d7d118881" />

