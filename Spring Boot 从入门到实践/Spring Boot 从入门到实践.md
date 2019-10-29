# Spring Boot 从入门到实践

一、Spring Boot快速入门

二、Spring Boot配置

三、Spring Boot与日志

四、Spring Boot与Web开发

五、Spring Boot与Docker

六、Spring Boot自定义配置原理

七、Spring Boot启动配置原理

八、Spring Boot自定义Staters

九、Spring Boot与缓存

十、Spring Boot与消息

十一、Spring Boot与检索

十二、Spring Boot与任务

十三、Spring Boot与安全

十四、Spring Boot 与分布式

十五、Spring Boot 与开发热部署

十六、Spring Boot与监控管理



---

## 一、Spring Boot快速入门

本系列教程根据本人实际学习SpringBoot2.x过程总结整理而来。

### 1、Spring Boot 简介

> - 简化Spring应用开发的一个框架；
> - 整个Spring技术栈的一个大整合；
> - J2EE开发的一站式解决方案；
>

### 2、微服务

> - 2014由martin fowler提出
> - 微服务：架构风格（服务微化）
> - 一个应用应该是一组小型服务；可以通过HTTP的方式进行互通；
> - 单体应用：ALL IN ONE
> - 微服务：每一个功能元素最终都是一个可独立替换和独立升级的软件单元；
> - [详细参照微服务文档](https://martinfowler.com/articles/microservices.html#MicroservicesAndSoa)
>

### 3、环境准备

> #### 开发环境
>
> - jdk1.8：Spring Boot 推荐jdk1.7及以上；java version "1.8.0_221"
> - maven3.x：maven 3.3以上版本；apache-maven-3.6.1
> - IntelliJIDEA2019：IntelliJ IDEA 2019.1.3 x64
> - SpringBoot 2.1.6.RELEASE：2.1.6；
>
> #### 开发配置：
>
> ##### 1、MAVEN设置；
>
> 给maven 的settings.xml配置文件的profiles标签添加，设置maven的创建项目时的默认编译版本使用jdk8
>
> ```xml
> <profile>
> <id>jdk-1.8</id>
> <activation>
>  <activeByDefault>true</activeByDefault>
>  <jdk>1.8</jdk>
> </activation>
> <properties>
>  <maven.compiler.source>1.8</maven.compiler.source>
>  <maven.compiler.target>1.8</maven.compiler.target>
>  <maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
> </properties>
> </profile>
> ```
>
> ##### 2、IDEA设置
>
> Idea整合Maven：
>
> ![1-1](E:\myCode\Spring Boot 从入门到实践\images\1-1.png)
>
> 

![1-2](E:\myCode\Spring Boot 从入门到实践\images\1-2.png)



### 4、Spring Boot HelloWorld

#### 快速开始，首先我们先创建一个统一的maven工程，用来管理我们之后学习中所有的项目：

首先创建一个用来进行统一管理的maven项目

- 新建项目

![1-3](E:\myCode\Spring Boot 从入门到实践\images\1-3.png)

- 选择Maven项目![1-4](E:\myCode\Spring Boot 从入门到实践\images\1-4.png)

- 填写GroupId、ArtifactId![1-5](E:\myCode\Spring Boot 从入门到实践\images\1-5.png)

- 填写项目名和项目路径![1-6](E:\myCode\Spring Boot 从入门到实践\images\1-6.png)

- 创建一个空的maven项目完成，选择允许自动导入![1-7](E:\myCode\Spring Boot 从入门到实践\images\1-7.png)

- 删除多余的目录，只保留一个pom.xml文件即可，同时在pom文件中添加springboot依赖和打包类型

  ```xml
  <parent>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-parent</artifactId>
      <version>2.1.6.RELEASE</version>
  </parent>
  <packaging>pom</packaging>
  ```

  

  ![1-8](E:\myCode\Spring Boot 从入门到实践\images\1-8.png)

#### 现在开始我们的 Spring Boot HelloWorld 项目：

一个功能：

浏览器发送hello请求，服务器接受请求并处理，响应Hello World字符串；

##### 1、创建一个maven工程；（jar）

在SpringBoot-In-Action项目中新建一个module,选择maven工程，命名为 spring-boot-01-helloworld

![1-9](E:\myCode\Spring Boot 从入门到实践\images\1-9.png)



##### 2、导入spring boot相关的依赖

因为springboot的依赖已经在父pom中导入

```xml
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.1.6.RELEASE</version>
    </parent>
```

所以在当前的pom中只需要导入spring-boot-starter-web的依赖即可：

```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>
```



## 二、Spring Boot配置

## 三、Spring Boot与日志
## 四、Spring Boot与Web开发
## 五、Spring Boot与Docker
## 六、Spring Boot自定义配置原理
## 七、Spring Boot启动配置原理
## 八、Spring Boot自定义Staters
## 九、Spring Boot与缓存
## 十、Spring Boot与消息
## 十一、Spring Boot与检索
## 十二、Spring Boot与任务
## 十三、Spring Boot与安全
## 十四、Spring Boot 与分布式
## 十五、Spring Boot 与开发热部署
## 十六、Spring Boot与监控管理



