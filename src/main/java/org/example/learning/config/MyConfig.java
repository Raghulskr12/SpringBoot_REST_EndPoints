package org.example.learning.config;

import org.example.learning.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {

    @Bean
    public Student student(Writer writer)
    {
       Student student= new Student();
       student.setAge(20);
       student.setRno(12);
       student.setWriter(writer);
       return student;
    }

    @Bean
    @Primary
    public Pen pen()
    {
        return new Pen();
    }

    @Bean
    public Pencil pencil()
    {
        return new Pencil();
    }

}
