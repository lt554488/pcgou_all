package cn.itsource.plat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: pcgou-parent
 * @description: 启动类
 * @create: 2019-07-26 21:54
 **/

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2 //开启Swagger支持
public class PlatApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatApplication.class,args);
    }
}