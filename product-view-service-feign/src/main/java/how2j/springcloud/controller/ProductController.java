package how2j.springcloud.controller;
import how2j.springcloud.pojo.Product;
import how2j.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 魏
 * @Date 2020/3/4 0004
 **/
@Controller
@RefreshScope
public class ProductController {
    @Value("${version}")
    String version;
    @Autowired
    ProductService productService;
    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> ps = productService.listProducts();
        m.addAttribute("version",version);
        m.addAttribute("ps", ps);
        return "products";
    }



}