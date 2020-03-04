package how2j.springcloud.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 魏
 * @Date 2020/3/4 0004
 **/
@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;

    public List listProdcuts() {
        return restTemplate.getForObject("http://product-data-service/products",List.class);
    }




}
