package com.company;

import java.util.Scanner;

public class zadacha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int max = 0;
        int max2 = 0;
        for (int i = 0; i <k; i++) {
            int x = sc.nextInt();
            if (i ==0) {
                max = x;
                max2 = x;
            }
            if (x>max) {
                max2 = max;
                max = x;
            } else if (x>max2) {
                max2 = x;
            }
        }
        System.out.println(max);
        System.out.println(max2);
    }
}
