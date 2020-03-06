package cn.how2j.springcloud.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 魏
 * @Date 2020/3/4 0004
 **/
//apiModel 用于实体类,当controller接口参数为该类 可以标注那么文档就会有参数的解释
@ApiModel(value = "Product",description="产品实体")
public class Product {
    @ApiModelProperty(value="产品id",name="id")
    private int id;
    @ApiModelProperty(value="产品名字",name="name")
    private String name;
    @ApiModelProperty(value="产品价格",name="price")
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product() {

    }

    public Product(int id, String name, int price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
