package how2j.springcloud.service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import how2j.springcloud.client.ProductClientFeign;
import how2j.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 魏
 * @Date 2020/3/4 0004
 **/
@Service

public class ProductService {
   @Autowired

   ProductClientFeign productClientFeign;
    @HystrixCommand(fallbackMethod = "productClientFeignHystrix")
    public List<Product> listProducts(){
       // List<Product> ps = new ArrayList<>();
        //ps.add(new Product(1,"product a from port:"+port, 50));
       // ps.add(new Product(2,"product b from port:"+port, 150));
       // ps.add(new Product(3,"product c from port:"+port, 250));
       // return ps;
        return  productClientFeign.listProdcuts();
    }

    public  List<Product> productClientFeignHystrix(){
        List<Product> result = new ArrayList<>();
        result.add(new Product(0,"产品数据微服务不可用",0));
        return result;
    }


}
