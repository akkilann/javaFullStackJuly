package com.multithread.runnable.demo2;

public class RunThread {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Runner run = new Runner();
            Thread t1 = new Thread(run, "Thread-1");
            t1.start();
            System.out.println(t1);
    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        System.out.println("Mapped");
    }
}
