package cn.how2j.springcloud.service;


import cn.how2j.springcloud.pojo.Product;
import cn.how2j.springcloud.pojo.ProductClientRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 魏
 * @Date 2020/3/4 0004
 **/
@Service
public class ProductService {
   @Autowired
   ProductClientRibbon productClientRibbon;

    public List<Product> listProducts(){
       // List<Product> ps = new ArrayList<>();
        //ps.add(new Product(1,"product a from port:"+port, 50));
       // ps.add(new Product(2,"product b from port:"+port, 150));
       // ps.add(new Product(3,"product c from port:"+port, 250));
       // return ps;
        return  productClientRibbon.listProdcuts();
    }
}
