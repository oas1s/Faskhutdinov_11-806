package com.company;

public class circle {
    protected int x;
    protected int y;
    protected int R;
    circle(int x,int y, int R) {
        this.x = x;
        this.y = y;
        this.R = R;
    }
    boolean compare() {
        return  true;
    }

    void haveSamePoint(int x1, int y1, int R1) {
        int pointDistance = (int) Math.sqrt((double)((x1-x)*(x1-x) + (y1-y)*(y1-y)));
        int radiusDistance =  R+R1;
        if (pointDistance == radiusDistance) {
            System.out.println("Имеют одну общую точку");
        }
        if (pointDistance > radiusDistance) {
            System.out.println("Имеют две общие точки");
        }
    }
}
