package cn.how2j;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author 魏
 * @Date 2020/3/4 0004
 **/
@SpringBootApplication  //springboot启动
@EnableEurekaClient       //client注册到服务中心
@EnableDiscoveryClient   //启用发现其他微服务
public class    ProductViewServiceRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductViewServiceRibbonApplication.class, args);
    }
    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
