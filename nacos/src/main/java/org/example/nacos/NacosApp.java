package org.example.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NacosApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosApp.class, args);
        System.out.println(applicationContext.getEnvironment().getProperty("person.name"));
        System.out.println(applicationContext.getEnvironment().getProperty("person.age"));
    }

}
