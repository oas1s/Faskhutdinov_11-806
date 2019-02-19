package com.company;

import java.util.Comparator;

public class Group {
    Student[] students;
    int n;

    public Group(int size) {
        this.students = new Student[size];
        this.n = size;
    }

    public void add(Student student, Comparator comparator){
        int c = 0;
        while (c<n && comparator.compare(student[c],student)) {
            c++;
        }
        for (int i = n - 1; i >= c; i--) {
            students[i + 1] = students[i];
        }
        students[c] = student;
        n++;
    }

    public void add(Student student){
        ByAgeComparator c = new ByAgeComparator();
        add(student, c);
    }
}