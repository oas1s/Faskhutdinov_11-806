package com.company;

public class zadacha2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 2, 3},
                       {7, 2, 9}};
        int maxstroch = 0;
        int stroch = 0;
        int numberofstroch = 0;
        int maxstolb = 0;
        int stolb = 0;
        int nuberofstolb = 0;
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                stroch = stroch + arr[i][j];
                if (stroch>maxstroch) {
                    maxstroch = stroch;
                    numberofstroch = i;
                }
                stolb = stolb + arr[j][i];
                if (stolb>maxstolb) {
                    maxstolb = stolb;
                    nuberofstolb = i;
                }
            }
            stolb = 0;
            stroch = 0;
        }
        for (int i = 0; i <3; i++) {
            System.out.print(arr[numberofstroch][i]);
        }
        System.out.println();
        for (int i = 0; i <3; i++) {
            System.out.println(arr[i][nuberofstolb]);
        }
      //  System.out.println(nuberofstolb);
       // System.out.println(numberofstroch);
    }
}
