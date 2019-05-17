package com.company;

import com.company.superbestawesomeframework.SuperBestAwesomeFramework;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class HWTestMain {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        List testList = SuperBestAwesomeFramework.getManyWithCons(Student.class, 5,  "John", 18, 10);
        System.out.println(testList.toString());
        System.out.println(testList.size());
    }
}
