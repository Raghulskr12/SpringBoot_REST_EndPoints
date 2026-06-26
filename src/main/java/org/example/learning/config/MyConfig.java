package org.example.learning.config;

import org.example.learning.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Student student()
    {
        return new Student();
    }

}
