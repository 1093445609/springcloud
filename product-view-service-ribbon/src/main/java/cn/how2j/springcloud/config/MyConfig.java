package cn.how2j.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 魏
 * @Date 2020/3/4 0004
 **/
@Configuration
public class MyConfig {
//通过 @LoadBalanced 注解开启均衡负载能⼒。

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }



}
