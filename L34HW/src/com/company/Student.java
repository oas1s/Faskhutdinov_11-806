package com.company;

import javax.swing.text.html.HTMLDocument;

public class Student {
    private int someint;
    private int age;
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, int someint) {
        this.name = name;
        this.age = age;
        this.someint = someint;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void passExam(String exam) {
        System.out.println(exam + " ваще на изи, " +
                "всё списал, ваще не палил");
    }

    @Override
    public String toString() {
        return "Student{" +
                "someint=" + someint +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
