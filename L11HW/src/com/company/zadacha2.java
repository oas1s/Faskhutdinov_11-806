package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zadacha2 {
    public static void main(String[] args) throws FileNotFoundException {
        File fle1 = new File("txt\\in1.txt");
        File fle2 = new File("txt\\in2.txt");
        Scanner sc1 = new Scanner(fle1);
        Scanner sc2 = new Scanner(fle2);
        PrintWriter pw = new PrintWriter("txt\\Out.txt");
        int a = sc1.nextInt();
        int b = sc2.nextInt();
        while (sc1.hasNextInt() || sc2.hasNextInt()) {
            if (a < b) {
                pw.println(a);
                if (sc1.hasNextInt()) {
                    a = sc1.nextInt();
                }
                else {
                    a = sc2.nextInt();
                }
            } else {
                pw.println(b);
                if (sc2.hasNextInt()) b = sc2.nextInt();
                else b = sc1.nextInt();
            }
        }
        if (a < b) {
            pw.println(a);
            pw.println(b);
        } else {
            pw.println(b);
            pw.println(a);
        }
        pw.close();
    }
}