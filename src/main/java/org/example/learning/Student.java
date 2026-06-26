package org.example.learning;

public class Student {

    private int age;
    private int rno;
    private Writer writer;


    public Student(int age, int rno, Writer writer) {
        this.age = age;
        this.rno = rno;
        this.writer = writer;
    }

    public Student() {

    }

    public void setRno(int rno) {
        this.rno = rno;
    }
    public void getAge() {
        System.out.println("the age is :"+age);
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void writeExam()
    {
        writer.write();
    }
    public void show()
    {
        System.out.println("Showing student");
    }

    public Writer getWriter() {
        return writer;
    }
}
