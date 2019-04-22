package com.company;

import com.company.superbestawesomeframework.SuperBestAwesomeFramework;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class HWTestMain {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        List lol = SuperBestAwesomeFramework.getManyWithCons(Student.class, 1, "John", 18);
        System.out.println(lol.toString());
        System.out.println(lol.size());
    }
}
