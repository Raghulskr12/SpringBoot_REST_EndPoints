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
//        s1.writeExam();
        System.out.println(s1.toString());
//        s1.show();
//        System.out.println(s1.getAge());
//        System.out.println(s1.getRno());
//        s1.setAge(30);
//        System.out.println(s1.getAge());
        SpringApplication.run(LearningApplication.class, args);

    }

}
