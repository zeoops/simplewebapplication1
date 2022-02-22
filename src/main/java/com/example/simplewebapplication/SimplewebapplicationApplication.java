package com.example.simplewebapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SimplewebapplicationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimplewebapplicationApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("Let's inspect the beans provied by pring boot:");
            String[] beansNames =ctx.getBeanDefinitionNames();
            Arrays.sort(beansNames);
            for (String beanName :beansNames){
                System.out.println(beanName);
            }

        };
    }

}
