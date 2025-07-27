package com.oops.practice;

public class Shape {
    void area(int rad){
        System.out.println("Square" + rad*rad);
    }

    void area(float rad){
        System.out.println("Circle" + (Math.PI*rad*rad));
    }

    int area(int len, int hei){
        return len * hei;
    }

    float area(int len, float hei){
        return len * hei;
    }


}
