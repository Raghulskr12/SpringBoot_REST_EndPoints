package org.example.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LearningApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
//        st1.show();
        System.out.println("hi");
        SpringApplication.run(LearningApplication.class, args);

    }

}
