package com.company;

import java.util.Scanner;

public class zadacha3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int k = sc.nextInt();
        int[] arr = new int[k];
        int count = 0;
        for (int i = 0; i <k; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <k-1; i++) {
            if ((arr[i] > arr[i+1]) & (arr[i] > arr[i-1])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
