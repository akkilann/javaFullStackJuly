package com.lambda.problemOne;

public class CalculatorMain {
    public static void main(String[] args) {
        ICalculator addition = (a, b) -> a + b;
        System.out.println("Addition :: " + addition.calc(10, 20));
        ICalculator sub = (a, b) -> a - b;
        System.out.println("sub :: " + sub.calc(10, 20));
        ICalculator multiply = (a, b) -> a * b;
        System.out.println("Multiply :: " + multiply.calc(10, 20));
        ICalculator division = (a, b) -> a / b;
        System.out.println("Division :: " + division.calc(10, 20));

    }
}
