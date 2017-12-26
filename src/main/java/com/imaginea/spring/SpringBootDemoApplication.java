package com.imaginea.spring;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootDemoApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Loading the spring boot");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBootController.class);
        SpringApplication.run(SpringBootDemoApplication.class, args);
        LOGGER.info("Succesfully started the spring boot");

    }
}
