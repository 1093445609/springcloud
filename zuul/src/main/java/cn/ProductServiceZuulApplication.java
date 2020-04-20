package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 以下注解可以使用
 * @SpringCloudApplication  @EnableZuulProxy
 * 替代
 * @SpringCloudApplication 它整合 了
 * @SpringBootApplication 、 @EnableDiscoveryClient 、 @EnableCircuitBreaker
 * @author 魏
 * @Date 2020/3/7 0007
 **/
@SpringBootApplication    //启动spring boot
@EnableZuulProxy         //网关 注解开启Zuul
@EnableEurekaClient      //微服务客户端
@EnableDiscoveryClient     //可以发现其他注册的微服务
public class ProductServiceZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceZuulApplication.class,args);
    }
}
