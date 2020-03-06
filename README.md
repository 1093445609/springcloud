# springcloud
依次启动微服务 先启动服务中心eureka-server  再启动配置服务器 config-server 随后启动 product-data-service 123数据微服务 
最后启动视图微服务  product-view-service-feign 
测试:http://localhost:8761/ 查看微服务是否都启动了?
    http://localhost:8030/version/dev 查看配置服务器 是否有version信息  可以配置自己的git仓库 
    http://localhost:8002/products   http://localhost:8001/products                       查看数据微服务
     http://localhost:8011/products       通过feign视图微服务来访问页面 分别都交给了数据微服务处理查询结果 
待续,下一节消息总线rabbitmq--------------------------
