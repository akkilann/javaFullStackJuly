package com.multi.thread.demo1;

public class Client {
    public static void main(String[] args) {
        Child thread1 = new Child();
        thread1.setName("Child-Thread-0");
        thread1.setPriority(Thread.MAX_PRIORITY);

        Child thread2 = new Child();
        thread2.setName("Child-Thread-1");
        thread2.setPriority(Thread.MAX_PRIORITY);

        Child thread3 = new Child();
        thread3.setName("Child-Thread-1");
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();

        thread2.start();

        thread3.start();
    }
}
