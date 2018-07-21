## 使用Guice与SpringBoot协作搭建Web应用
- 使用Spring Boot搭建简单的Web应用
- 使用Guice搭建业务逻辑


## 协作架构
```
Spring Boot REST Controller
^
|
|
使用Guice搭建的业务逻辑 <----- 其他组件
^
|
|
Spring Data JPA

```
