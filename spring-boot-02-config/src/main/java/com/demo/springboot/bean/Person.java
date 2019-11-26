package com.demo.springboot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author lijian
 * @Date 2019/11/25 20:47
 *
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties： 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 *      prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 */
@Data
@ToString
@Component // 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能
@ConfigurationProperties(prefix = "person")
public class Person {

    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
