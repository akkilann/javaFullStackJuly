package com.multi.thread.demo1;

public class Child extends Thread{



    @Override
    public void run(){
        //Write your logic once the thread is started
        System.out.println("Threading is in running state" + Thread.currentThread().getName() );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
