package org.example.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LearningApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

        Student s1 = (Student) context.getBean("st1");
        s1.show();
        SpringApplication.run(LearningApplication.class, args);

    }

}
