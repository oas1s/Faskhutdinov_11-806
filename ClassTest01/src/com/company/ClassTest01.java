package com.company;

import java.util.Scanner;

public class ClassTest01 {

     public static void sortArr(int[] arr) {
        int c;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length-1; j++) {
                int sum = 0;
                int sum2 = 0;
                int save = arr[j];
                int save2 = arr[j+1];
                while (arr[j]>0) {
                    sum = sum + arr[j]%10;
                    arr[j] = arr[j]/10;
                }
                while (arr[j+1]>0) {
                    sum2 = sum2 + arr[j+1]%10;
                    arr[j+1] = arr[j+1]/10;
                }
                if (sum2>sum) {
                    arr[j] = save2; // arr[j] = arr[j+1](save2)
                    arr[j+1] = save; // arr[j+1] = arr[j](save
                }
                else {
                    arr[j] = save;
                    arr[j+1] = save2;
                }
            }
        }

        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void fillSpiral(int[][] matrix,int[] schit) {
        int n = matrix.length;
        int count = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                matrix[i][j] = schit[count];
                count = count + 1;
            }
            for (int j = i; j < n - 1 - i; j++) {
                matrix[j][n - 1 - i] = schit[count];
                count = count + 1;
            }
            for (int j = n - 1 - i; j > i; j--) {
                matrix[n - 1 - i][j] = schit[count];
                count = count + 1;
            }
            for (int j = n - 1 - i; j > i; j--) {
                matrix[j][i] = schit[count];
                count = count + 1;
            }
        }
        if (n % 2 == 1) {
            matrix[n / 2][n / 2] = schit[count+1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
   public static int underDiagonalSum(int[][] matrix) {
         int sum = 0;
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix.length; j++) {
                if (i>j) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n*n];
        for (int i = 0; i <mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        sortArr(mas);
        int[][] doublemas = new int[n][n];
        fillSpiral(doublemas,mas);
        System.out.println(underDiagonalSum(doublemas));
    }
}
