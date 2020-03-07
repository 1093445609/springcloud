package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 断路器监控启动器
 * @author 魏
 * @Date 2020/3/7 0007
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashApplication.class,args);
    }
}
