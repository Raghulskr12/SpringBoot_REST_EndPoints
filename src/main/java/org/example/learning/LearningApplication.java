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
        Pen pen1 = (Pen) context.getBean("p1");

        pen1.write();
//        s1.show();
//        System.out.println(s1.getAge());
//        System.out.println(s1.getRno());
//        s1.setAge(30);
//        System.out.println(s1.getAge());
        SpringApplication.run(LearningApplication.class, args);

    }

}
