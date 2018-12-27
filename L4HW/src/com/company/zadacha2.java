package com.company;

import java.util.Scanner;

public class zadacha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строчку");
        String str = sc.next();
        System.out.println("Введите на сколько нужно сдвигать");
        int sdvig = sc.nextInt();
        char[] arr = str.toCharArray();
        for (int i = 0; i <sdvig; i++) {
            char last = arr[arr.length-1];
            for (int j = arr.length-1; j >0; j--) {
                arr[j] = arr[j-1];
            }
           arr[0] = last;
        }
        for (int i = 0; i <str.length(); i++) {
            System.out.print(arr[i]);
        }
    }
}
