package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static long mainSum = 0;

    public static void main(String[] args) throws InterruptedException {
        Random randomizer = new Random();
        int[] RandomArr = new int[1000];
        long sum = 0;
        for (int i = 0; i <RandomArr.length; i++) {
            RandomArr[i] = randomizer.nextInt();
            sum += RandomArr[i];
        }
        System.out.println(sum);

        CounterThread[] threads = new  CounterThread[5];
        int step = RandomArr.length/5;
        int start=0;
        int end = step;
        for (int i = 0; i <5; i++) {
            threads[i] = new CounterThread(RandomArr,start,end);
            start += step;
            end += step;
        }
        for (int i = 0; i <5; i++) {
            threads[i].start();
            threads[i].join();
        }
        System.out.println(Main.mainSum);

//        CounterThread first = new CounterThread(RandomArr,0,200);
//        CounterThread second = new CounterThread(RandomArr,200,400);
//        CounterThread third = new CounterThread(RandomArr,400,600);
//        CounterThread four = new CounterThread(RandomArr,600,800);
//        CounterThread five = new CounterThread(RandomArr,800,1000);
//        first.start();
//        second.start();
//        third.start();
//        four.start();
//        five.start();
//
//        first.join();
//        second.join();
//        third.join();
//        four.join();
//        five.join();
//        System.out.println(Main.mainSum);
    }
}
