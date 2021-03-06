package cn.how2j;
import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * http://localhost:8001/swagger-ui.html接口文档
 *
 * @author 魏
 * @Date 2020/3/4 0004
 **/
@SpringBootApplication
@EnableEurekaClient
public class ProductDataServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductDataServiceApplication.class,args);
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

}
