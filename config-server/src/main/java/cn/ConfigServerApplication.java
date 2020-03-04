package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 魏
 * @Date 2020/3/5 0005
 **/

@SpringBootApplication
@EnableConfigServer         //配置服务器
@EnableDiscoveryClient        //可以发现其他服务
@EnableEurekaClient            //可以注册服务
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
