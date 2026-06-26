package org.example.learning;

import org.example.learning.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LearningApplication {

    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

         ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);



        Student s1 = (Student) context.getBean("student");
//        System.out.println(s1.getRno());
       s1.writeExam();
        SpringApplication.run(LearningApplication.class, args);

    }

}
