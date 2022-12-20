package com.xj.test;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlMapTest {
    // �����ṩ��
    public void generator() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //ָ�� ���򹤳������ļ�
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
    //���������������������ļ�
    public static void main(String[] args) throws Exception {
        try {
            GeneratorSqlMapTest generatorSqlmap = new GeneratorSqlMapTest();
            generatorSqlmap.generator();
            System.out.println("���򹤳�ִ����ɣ���ˢ����Ŀ�鿴�����ļ�");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
