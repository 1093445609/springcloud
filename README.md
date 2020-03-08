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

结束总结:----------------------------------------------------------------
1.创建父项目 并配置通用的依赖,并统一管理spring cloud版本

2.子项目分为  eureka注册服务中心 将其他微服务注册进来
              eureka client 微服务客户端  可以注册到服务中心
配置类的微服务需要发现其他注册的微服务@EnableDiscoveryClient   //启用发现其他微服务
                  需要开启服务       @EnableXXX               
第三方的服务   

          rabbitmq  消息中间件     
          zipkin 服务链路追踪 (需要开启-jar命令,java -jar zipkin-server-2.10.1-exec.jar|||||||
java -jar zipkin-server-2.10.1-exec.jar --zipkin.collector.rabbitmq.addresses=localhost)


微服务端口:


eureka-server(微服务注册中心): 8761
config-server(版本配置服务器): 8030
Product-data-server(数据微服务) :8001  8002
product-view-service(视图微服务):   8011  8012
hystix-dashboard(断路器监控仪表盘): 8020
turbine(断路器聚合) :8021
produce-service-zuul(网关): 8022

其他端口: 
  rabbitmq管理端口  http://localhost:15672/
 	zipkin服务链路  http://localhost:9411/zipkin/dependency/
需要安装:
 rabbitmq, zipkin,git仓库,idea,maven,Jdk1.8等
--------------------------------------------------------------------
访问的地址:
  1.查看微服务: http://localhost:8761/
  2.访问数据微服务: http://localhost:8001/products|||http://localhost:8002/products
  3.访问视图微服务: http://localhost:8011/products||||http://localhost:8012/products
  4.版本配置 ->config-server 配置的uri 地址修改为自己的git仓库 并配置版本信息
  5.断路器仪表盘: http://localhost:8020/hystrix    访问具体微服务http://localhost:8011/actuator/hystrix.stream 和							     http://localhost:8012/actuator/hystrix.stream 
聚合:  访问   http://localhost:8021/turbine.stream
  6.网关: 访问数据微服务          http://localhost:8022//api-data/products
          访问视图微服务         http://localhost:8022//api-view/products
  7.读取bus消息刷新版本post:  http://localhost:8012/actuator/bus-refresh/ 和http://localhost:8011/actuator/bus-refresh/
             
              其他地址访问    http://localhost:8012/actuator
  8.读取dev http://localhost:8030/version/env http://localhost:8011/actuator/env/ 等/*/dev
  9.文档,随便写的: http://localhost:8001/swagger-ui.html

