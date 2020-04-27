## Spring Cloud 实战项目

### 项目介绍

    基于SpringBoot2.x、SpringCloud并采用前后端分离的企业级微服务系统架构。
    并引入组件化的思想实现高内聚低耦合，项目代码简洁注释丰富上手容易，适合学习和企业中使用。
    真正实现了基于RBAC、jwt和oauth2的无状态统一权限认证的解决方案，
    面向互联网设计同时适合B端和C端用户，支持CI/CD多环境部署，
    并提供应用管理方便第三方系统接入；
    同时还集合各种微服务治理功能和监控功能。
    模块包括:企业级的认证系统、应用监控、Cat监控、统一日志、
    可靠消息系统、单点登录、Redis分布式高速缓存、配置中心、分布式任务调度、接口文档、代码生成等等


#### SpringBoot2.0+SpringCloud 构建微服务电商商城。
- 完整的购物流程
- 运营管理及权限管理
- oauth授权中心+单点登录+第三方登录
- 支付宝微信支付
- 调用链及JVM监控及接口耗时监控
- 可靠消息系统
- 数据服务中心
- 授权服务中心
- 订单服务中心
- 消息服务中心
- 外部对接服务中心
- 七牛云上传下载
- 邮件短信发送
#### 技术栈

    核心框架：springcloud Edgware全家桶
	安全框架：Spring Security Spring Cloud Oauth2
	分布式缓存:redis
	分布式消息队列：RocketMQ
	分布式任务调度：elastic-job
	持久层框架：MyBatis、通用Mapper4、Mybatis_PageHelper
	数据库连接池：Alibaba Druid
	日志管理：Logback
	前端框架：Vue全家桶以及相关组件
	三方服务： 邮件服务、阿里云短信服务、七牛云文件服务、钉钉机器人服务、高德地图API

#### 架构图
![](http://cdn.shevip.cn/blog-a30b33ca04a942bca8332cbd971b83ec)

#### 工程结构
    ├─cmall----------------------------父项目，公共依赖
    │  │
    │  ├─cmall-eureka--------------------------微服务注册中心
    │  │
    │  ├─cmall-gateway--------------------------微服务网关中心
    │  │
    │  ├─cmall-service
    │  │  │
    │  │  ├─cmall-service-mdc------------------数据服务中心
    │  │  │
    │  │  ├─cmall-service-omc------------------订单服务中心
    │  │  │
    │  │  ├─cmall-service-opc------------------对接服务中心
    │  │  │
    │  │  ├─cmall-service-tpc------------------任务服务中心
    │  │  │
    │  │  └─cmall-service-auth------------------用户服务中心
    │  │
    │  ├─cmall-service-api
    │  │  │
    │  │  ├─cmall-service-mdc-api------------------数据服务中心API
    │  │  │
    │  │  ├─cmall-service-omc-api------------------订单服务中心API
    │  │  │
    │  │  ├─cmall-service-opc-api------------------对接服务中心API
    │  │  │
    │  │  ├─cmall-service-tpc-api------------------任务服务中心API
    │  │  │
    │  │  ├─cmall-service-sdk-api------------------可靠消息服务API
    │  │  │
    │  │  └─cmall-service-auth-api------------------用户服务中心API
    │  │
    │  ├─cmall-common
    │  │  │
    │  │  ├─cmall-common-base------------------公共POJO基础包
    │  │  │
    │  │  ├─cmall-common-config------------------公共配置包
    │  │  │
    │  │  ├─cmall-common-core------------------微服务核心依赖包
    │  │  │
    │  │  ├─cmall-common-util------------------公共工具包
    │  │  │
    │  │  ├─cmall-common-zk------------------zookeeper配置
    │  │  │
    │  │  ├─cmall-security-app------------------公共无状态安全认证
    │  │  │
    │  │  ├─cmall-security-core------------------安全服务核心包
    │  │  │
    │  │  └─cmall-security-feign------------------基于auth2的feign配置

    


#### 文档及演示

[文档地址](http://www.chilangedu.com/course/1391679647.html)



#### 商城系统
![](http://cdn.shevip.cn/blog-3588b51b61704a24bb8537a324dfdde5)

![](http://cdn.shevip.cn/blog-f908557f0b5f403494851479b5efc3d9)

![](http://cdn.shevip.cn/blog-66c064bb67584fd5b3bef4b881efa1d6)

![](http://cdn.shevip.cn/blog-9f8058f53ee94387ae4c8e3a63ca2a12)

![](http://cdn.shevip.cn/blog-619bd4a62a344f188421d1d417691f31)

![](http://cdn.shevip.cn/blog-635c70e3d81d489284b088d4f47c22d1)

![](http://cdn.shevip.cn/blog-b6462954cd1e46278874d914c9c8c265)

![](http://cdn.shevip.cn/blog-16dec74e3cc442d892d1e9e48c281d33)

![](http://cdn.shevip.cn/blog-57afe66f9377469a9d93e9c744b9c3b2)

![](http://cdn.shevip.cn/blog-877874a4da46465794222907fe399515)
 

