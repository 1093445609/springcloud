package how2j.springcloud.client;

import how2j.springcloud.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 魏
 * @Date 2020/3/4 0004
 **/
@Component
@FeignClient(value = "product-data-service")  //数据微服务的名称
public interface ProductClientFeign {

    @GetMapping("/products")
    List<Product> listProdcuts();

}
