package cn.fo9c.multimedia_main;

import com.baomidou.mybatisplus.core.MybatisPlusVersion;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("cn.fo9c.multimedia_main.mapper")
public class MultimediaMainApplication {

    public static void main(String[] args) {
        // 下面获取的是URL的环境变量
        ConfigurableApplicationContext application = SpringApplication.run(MultimediaMainApplication.class, args);
        Environment env = application.getEnvironment();
        String port = env.getProperty("server.port");
        String property = env.getProperty("server.servlet.context-path");
        String path = property == null ? "" :  property;

        // 下面获取的是SpringBoot的环境变量
        String springBootVersion = SpringBootVersion.getVersion();

        // 下面获取的是Mybatis-Plus的环境变量
        Package pkg = MybatisPlusVersion.class.getPackage();
        String mybatisPlusVersion = pkg.getImplementationVersion();

        System.out.println(
                "———————————————————————————————————————————————————————————————————————————————————————————————————————————\n\t" +
                "         Access URLs:   http://localhost:" + port + path + "              SpringBoot   Version: " + springBootVersion + "\n\t" +
                "         DataBase:      MySQL                              Mybatis-Plus Version: " + mybatisPlusVersion + "\n" +
                "———————————————————————————————————————————————————————————————————————————————————————————————————————————");
    }

}
