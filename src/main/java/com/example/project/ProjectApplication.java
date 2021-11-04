package com.example.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {

         System.out.println("Let's inspect the bean provided by Spring Boot: ");

         String[] beansNames = ctx.getBeanDefinitionNames();
         Arrays.sort(beansNames);
         for(String beanName : beansNames){
             System.out.println(beanName);
         }

        };
    }
}
