package com.company;

import java.util.Scanner;

public class СlassTest02 {
     public static boolean req(char[] charmas,int index) {
        if (charmas[index] == charmas[charmas.length-index-1]) {
            if (index*2<charmas.length) {
                return req(charmas, index+1);
            }
            else {
                return true;
            }

        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stroq =sc.next();
        char[] checkchar = stroq.toCharArray();
        System.out.println(req(checkchar,0));
    }
}
