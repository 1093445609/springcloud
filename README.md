# springcloud
依次启动微服务 先启动服务中心eureka-server 
 再启动配置服务器 config-server
 随后启动 product-data-service 123数据微服务 
最后启动视图微服务  product-view-service-feign 

测试:http://localhost:8761/ 查看微服务是否都启动了?
 http://localhost:8030/version/dev 查看配置服务器 是否有version信息  可以配置自己的git仓库 
 http://localhost:8002/products   http://localhost:8001/products      查看数据微服务
 http://localhost:8011/products   通过feign视图微服务来访问页面 分别都交给了数据微服务处理查询结果 
--------------------------------------------------
http://localhost:8001/swagger-ui.html 8001随便加了一个接口文档 swagger2
-----------------------------------------------------
通过视图微服务调用一次服务http://localhost:8010/products
http://localhost:8011/products
通过服务链路查看服务 http://localhost:9411/zipkin/dependency/
-----------------------------------------------------------

消息总线bus 启动微服务后修改git版本version属性  刷新配置
http://localhost:8011/actuator/bus-refresh/ 
-----------------------------------------------------------
其他开放的,信息请访问地址查看具体哪些可以访问:http://localhost:8011/actuator
