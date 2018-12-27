package com.company;

public class zadachaD {
    public static void main(String[] args) {
        double n = 129;
        if (recursion(n) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int recursion(double n) {
        if (n == 1) {
            return 1;
        } else if (n > 1 && n < 2) {
            return 0;
        } else {
            return recursion(n / 2);
        }
    }
}