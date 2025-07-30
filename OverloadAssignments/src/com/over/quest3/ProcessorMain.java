package com.over.quest3;

public class ProcessorMain {
    public static void main(String[] args) {

        Processor processor = new Processor();

        processor.calculate(25.0); //sq rt

        processor.calculate(25, 25); //multiply or product

        processor.calculate(40.0, 20.0); //difference or minus

        processor.calculate(20.0, 4); // print x power y

        processor.calculate(60);
    }
}
