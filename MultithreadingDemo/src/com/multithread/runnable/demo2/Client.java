package com.multithread.runnable.demo2;

public class Client implements Runnable{
    @Override
    public void run() {
        System.out.println("Starting my thread");
    }
}
