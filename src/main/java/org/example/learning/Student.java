package org.example.learning;

public class Student {

    private int age;
    private int rno;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show()
    {
        System.out.println("Showing student");
    }
}
