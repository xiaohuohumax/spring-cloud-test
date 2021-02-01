# spring cloud 练习项目

## 项目包含

+ eureka 集群
+ zuul 网关
+ config git 配置

## 注意

+ spring-cloud-client-hello-8000 配置了 config 需要最后启动
+ 请在hosts 文件下添加 虚拟路径
    ```
        127.0.0.1 localhost1
        127.0.0.1 localhost2
        127.0.0.1 localhost3
        127.0.0.1 localhost4
    ```
+ 修改spring-cloud-config-10000 中的git 地址