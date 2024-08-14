package com.jd.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {
    public static void main(String[] args) {

        // 1: Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Configure the things that we want Spring to manage -@Configuration
        // HelloWorldConfiguration - @Configuration
        // name - @Bean

        // 3: Retrieving Beans managed by Spring context
        System.out.println(context.getBean("name"));
    }
}
