package cn.how2j.springcloud.service;

import cn.how2j.springcloud.pojo.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 魏
 * @Date 2020/3/4 0004
 **/
@Api(value = "ProductService",tags = "产品业务")
@Service
public class ProductService {
    @Value("${server.port}")
    String port;
    @ApiOperation(value = "模拟查询用户详细信息")
    public List<Product> listProducts(){
        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1,"product a from port:"+port, 50));
        ps.add(new Product(2,"product b from port:"+port, 150));
        ps.add(new Product(3,"product c from port:"+port, 250));
        return ps;
    }
}
