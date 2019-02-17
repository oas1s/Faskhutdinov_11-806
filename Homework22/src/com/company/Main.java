package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> map = new SimpleMap<>(1);
        Scanner in = new Scanner(new File("C:\\Users\\azata\\Desktop\\Faskhutdinov_11-806\\Homework22\\src\\com\\company\\in.txt"));
        while(in.hasNext()){
            String str = in.next();
            str = str.replaceAll("//.","");
            str = str.replaceAll("//,| ?,","");
            str = str.replaceAll("//: | ?:","");
            if(map.get(str) == null)
                map.put(str, 1);
            else
                map.put(str, map.get(str) + 1);
        }
        in.close();
        map.printMap();
    }
}