package com.oops.practice;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(10);
        shape.area(10.0f);

        int rec = shape.area(10,20);
        System.out.println("Area of rec ::" +rec);
        int rectangle = shape.area(10, (int)20.0f);
        System.out.println("Area of rectangle ::" +rectangle);

    }
}
