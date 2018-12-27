package com.company;

import java.util.Scanner;
public class zadacha3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] m = str.toCharArray();
        int count = 0;
        int maxcount = 0;
        for (int i = 0; i <str.length()-1; i++) {
            if (m[i] != m[i+1]) {
                count = 0;
            }
            if (m[i] == m[i+1]) {
                count++;
            }
            if (count>maxcount) {
                maxcount= count;
            }
        }
        System.out.println(maxcount+1);
    }
}