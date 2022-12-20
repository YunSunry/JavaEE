package com.xj.test;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlMapTest {
    // 官网提供的
    public void generator() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定 逆向工程配置文件
        InputStream in = GeneratorSqlMapTest.class.getClassLoader()
            .getResourceAsStream("mybatis-generator-config.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(in);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
        in.close();
    }
    //运行生成器方法，生成文件
    public static void main(String[] args) throws Exception {
        try {
            GeneratorSqlMapTest generatorSqlmap = new GeneratorSqlMapTest();
            generatorSqlmap.generator();
            System.out.println("逆向工程执行完成，需刷新项目查看生成文件");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
