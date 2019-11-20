# Spring Boot 从入门到实践





---

## 一、Spring Boot快速入门

本系列教程根据本人实际学习使用 SpringBoot2.x 过程总结整理而来。

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

#### 开发环境：

> - jdk1.8：Spring Boot 推荐jdk1.7及以上；java version "1.8.0_221"
> - maven3.x：maven 3.3以上版本；apache-maven-3.6.1
> - IntelliJIDEA2019：IntelliJ IDEA 2019.1.3 x64
> - SpringBoot 2.2.1.RELEASE：2.1.6；
>

#### 开发配置：

##### 1、MAVEN设置：

给 maven 的 `settings.xml` 配置文件的 `profiles` 标签添加下面的配置，设置 maven 的创建项目时的默认编译版本使用 `jdk8`

> ```xml
> <profile>
> <id>jdk-1.8</id>
> <activation>
> <activeByDefault>true</activeByDefault>
> <jdk>1.8</jdk>
> </activation>
> <properties>
> <maven.compiler.source>1.8</maven.compiler.source>
> <maven.compiler.target>1.8</maven.compiler.target>
> <maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
> </properties>
> </profile>
> ```
>

##### 2、IDEA设置：

Idea 整合 Maven：

> ![1-1](./images/1-1.png)
>
> ![1-2](./images/1-2.png)

### 4、创建 Spring Boot HelloWorld

#### 1、快速开始

首先我们先创建一个统一的 maven 工程，用来管理我们之后学习中所有的项目：

##### 1、新建项目

![1-3](./images/1-3.png)

##### 2、选择Maven项目![1-4](./images/1-4.png)

##### 3、填写GroupId、ArtifactId

GroupId：`com.demo.springboot`

ArtifactId：`SpringBoot-In-Action`

##### ![1-5](./images/1-5.png)

##### 5、填写项目名和项目路径![1-6](./images/1-6.png)

##### 6、创建一个空的maven项目完成，选择允许自动导入![1-7](./images/1-7.png)

##### 7、删除多余的目录

只保留一个pom.xml文件即可，同时在pom文件中添加springboot依赖和打包类型

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.2.1.RELEASE</version>
</parent>
<packaging>pom</packaging>
```



![1-8](./images/1-8.png)

#### 2、现在开始我们的 Spring Boot HelloWorld 项目：

`一个功能：浏览器发送hello请求，服务器接受请求并处理，响应Hello World字符串`；

##### 1、创建一个maven工程；（jar）

在SpringBoot-In-Action项目中新建一个module,选择maven工程，命名为 spring-boot-01-helloworld

![1-9](./images/1-9.png)



##### 2、导入spring boot相关的依赖

因为springboot的依赖已经在父pom中导入

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.2.1.RELEASE</version>
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

完整 `pom` 文件如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>SpringBoot-In-Action</artifactId>
        <groupId>com.demo.springboot</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>spring-boot-01-helloworld</artifactId>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>

</project>
```

##### 3、编写一个主程序；启动Spring Boot应用

![1-10](./images/1-10.png)

```java
/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        // Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
```

##### 4、编写相关的Controller、Service

为了演示，我在这里只创建了 `Controller` 类，省略了 Service

```java
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
```

##### 5、运行主程序测试效果

选中 `HelloWorldMainApplication` 右键单击选择 `Run ...` ，或者打开 `HelloWorldMainApplication` 按下快捷键 `Ctrl+Shift+F10` 运行程序，可以看到项目在 `8080` 端口启动：

![1-11](./images/1-11.png)

在浏览器中访问  http://localhost:8080/hello 可以看到正常返回了 `Hello World` 。

![1-12](./images/1-12.png)

至此，我们的第一个 Spring Boot 项目算是创建完了。

##### 6、补充：简化部署

在当前项目，即 `spring-boot-01-helloworld` 的 `pom` 文件中添加下面的配置

```xml
<!-- 这个插件，可以将应用打包成一个可执行的jar包；-->
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```

然后选中当前 `pom` 文件，右键单击，选择 `Run Maven`  → `package` ，将这个应用打成 `jar` 包，可以看到 `target` 文件夹下生成一个名为 `spring-boot-01-helloworld-1.0-SNAPSHOT.jar`  的 `jar` 文件，我们可以直接在命令行使用 `java -jar xxx.jar` 命令进行执行，启动后在浏览器中访问  http://localhost:8080/hello 可以看到正常返回了 `Hello World` 。若要结束程序，关闭命令行窗口即可。

![1-13](./images/1-13.png)

> 思考：为什么我们打包后的程序可以直接在命令行使用 `java jar` 命令就可以部署？

带着疑问我们来分析一下 `spring-boot-01-helloworld-1.0-SNAPSHOT.jar` ，我们使用压缩文件打开 `spring-boot-01-helloworld-1.0-SNAPSHOT.jar`，可以看到如下所示的目录结构：

![1-14](./images/1-14.png)

我们打开 `BOOT-INF` 文件夹看到有 `classes` 和 `lib` 两个文件夹，我们写的代码的二进制字节码就在 `classes` 目录下，而 `lib` 下可以看到是我们项目依赖的所有 `jar` 包，最关键的，我们的项目是一个 `web` 项目，可以看到所依赖的内嵌的 `tomcat` jar包，这是我们项目能独立部署的关键：

![1-15](./images/1-15.png)

其他目录 `META-INF` 存放项目的 `pom` 文件，`org` 目录下存放的是 `springframework` 相关代码。

### 5、Hello World探究

#### 1、POM文件

##### 1、父项目

spring-boot-01-helloworld 的 pom：

```xml
<parent>
    <artifactId>SpringBoot-In-Action</artifactId>
    <groupId>com.demo.springboot</groupId>
    <version>1.0-SNAPSHOT</version>
</parent>
```

它的父项目是 SpringBoot-In-Action 中的 pom：

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.2.1.RELEASE</version>
</parent>

<packaging>pom</packaging>

<groupId>com.demo.springboot</groupId>
<artifactId>SpringBoot-In-Action</artifactId>
<version>1.0-SNAPSHOT</version>

<modules>
    <module>spring-boot-01-helloworld</module>
</modules>
```

而

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



