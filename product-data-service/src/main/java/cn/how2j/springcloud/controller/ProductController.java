package cn.how2j.springcloud.controller;

import cn.how2j.springcloud.pojo.Product;
import cn.how2j.springcloud.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 魏
 * @Date 2020/3/4 0004
 **/
@Api(tags = "产品管理")
@Controller
@ResponseBody
public class ProductController {
    @Autowired
    ProductService productService;
    @ResponseBody
    @GetMapping("/products")
    @ApiOperation(value = "获取用户详细信息", tags={"获取产品列表信息copy"},notes = "获取产品列表详细信息")
    public Object products() {
        List<Product> ps = productService.listProducts();
        return ps;
    }
}
