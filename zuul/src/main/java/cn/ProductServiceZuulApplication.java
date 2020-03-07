package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 魏
 * @Date 2020/3/7 0007
 **/
@SpringBootApplication    //启动spring boot
@EnableZuulProxy         //网关
@EnableEurekaClient      //微服务客户端
@EnableDiscoveryClient     //可以发现其他注册的微服务
public class ProductServiceZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceZuulApplication.class,args);
    }
}
