package com.ncvt.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//不添加值  则为默认值
@Component("dBUtil")
//跟数据库相关的属性
public class DBUtil {
//	需要用到的相关属性  驱动名 连接 用户名 密码
	
//	@Value("com.mysql.jdbc.Driver")
	@Value("${db.driver}")
	private String driver;
	
	
//	@Value("jdbc:mysql://localhost:3306/mydb")
	@Value("${db.url}")
	private String url;
	
	
//	@Value("zhangsan")
	@Value("${db.username}")
	private String username;
	
//	@Value("123456")
	@Value("${db.password}")
	private String password;
	
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DBUtil [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
	
	

}
