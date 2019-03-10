package com.company;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Student> compareByName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                 return  o1.getName().compareTo(o2.getName());
            }
        };
        Group group = new Group(10);
        Student st1 = new Student(18,"Igor","ITIS");
        Student st2 = new Student(19,"Azat","IVMiIT");
        Student st3 = new Student(20,"Murat","IMO");
        Student st4 = new Student(22,"Dima","ITIS");
        group.add(st1);
        group.add(st2);
        group.add(st3);
        group.add(st4);
        group.show();
        Group group2 = new Group(10,compareByName);
        group2.add(st1);
        group2.add(st2);
        group2.add(st3);
        group2.add(st4);
        group2.show();
        Comparator<Student> compareByFaculty = (o1,o2) -> {
            return o1.getFaculty().compareTo(o2.getFaculty());
        };
        Group group3 = new Group(10,compareByFaculty);
        group3.add(st1);
        group3.add(st2);
        group3.add(st3);
        group3.add(st4);
        group3.show();
    }
}