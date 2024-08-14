package com.jd.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Eliminate verbosity in creating Java Beans.
// Public accessor methods, constructor.
// equals, hashcode and toString are automatically created.
// Released in JDK 16.

record Person (String name, int age) { };
record Address (String firstLine, String city) { }; 

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Jyotirmoy";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Joe", 21);
    }

    @Bean
    public Address address() {
        return new Address("Beltola", "Guwahati");
    }

}
