package com.mall;

//import com.utils.SpringUtil;
import org.apache.ibatis.io.Resources;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/23.
 */
public class MainTest {

    public  static  void main(String [] args)throws  Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定逆向工程配置文件
        InputStream configFile= Resources.getResourceAsStream("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
  //      ClassPathXmlApplicationContext cp=new ClassPathXmlApplicationContext("spring-mybatis.xml");
//       SchoolService schoolService=(SchoolService) SpringUtil.getBean("schoolServiceImple");
//        schoolService.selectAll();
    }
}
