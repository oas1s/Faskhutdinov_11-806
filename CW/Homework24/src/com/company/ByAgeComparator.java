package com.company;

import java.util.Comparator;

public class ByAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
         return o1.getAge() - o2.getAge();
    }
}
