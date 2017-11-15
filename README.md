### spring cloud demo 使用说明

#### 项目介绍
 
Demo项目由注册中心模块(registerCenter), 服务发布模块(service), 服务发现消费模块(consumer)构成


注册中心模块(registerCenter): 

* 服务发布及消费的注册中心：服务发布到注册中心，服务的消费订阅到注册中心, 服务发布和服务消费订阅在
  注册中心均可见， 方问地址： http://localhost:8080


服务发布模块(service):

* mvn springboot:run 启动, 服务方问地址: http://localhost:8085/hello


服务发现消费模块(consumer): 
 
* mvn springboot:run 启动, 服务方问地址: http://localhost:9000/ribbon-consumer


#### 启动步骤

* 先启动注册中心模块(registerCenter)

* 服务发布模块(service)

* 服务发现消费模块(consumer)



