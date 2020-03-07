package cn.how2j;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * 视图微服务
 *
 * @author 魏
 * @Date 2020/3/4 0004
 **/
@SpringBootApplication  //springboot启动
@EnableEurekaClient       //client注册到服务中心
@EnableDiscoveryClient   //启用发现其他微服务
@EnableFeignClients       //使用feign
@EnableHystrix      //断路器
@EnableCircuitBreaker  //修改后将信息共享到监控中心(断路器仪表盘)
public class ProductViewServiceRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductViewServiceRibbonApplication.class, args);
    }

    //服务链路策略
    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
