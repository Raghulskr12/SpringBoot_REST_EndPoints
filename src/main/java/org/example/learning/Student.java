package org.example.learning;

import lombok.Data;

@Data
public class Student {
    private int age;
    private int rno;
    private Writer writer;
    public Student(int age, int rno, Writer writer) {
        this.age = age;
        this.rno = rno;
        this.writer = writer;
    }
    public Student() {};


    public void writeExam() {writer.write();}

}
