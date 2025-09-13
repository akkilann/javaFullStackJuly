package com.multithread.runnable.demo2;

public class Server {
    public static void main(String[] args) {
        Thread thread = new Thread("My New Thead");
        thread.start();
    }
}
