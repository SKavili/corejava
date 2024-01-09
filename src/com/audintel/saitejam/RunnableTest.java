package com.audintel.saitejam;

public class RunnableTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableTest1());
        Thread t2 = new Thread(new RunnableTest2());
        t1.start();
        t2.start();
    }
}

class RunnableTest1 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In Thread 1: and number at: " + i);
        }
    }
}

class RunnableTest2 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In Thread 2: and number at: " + i);
        }
    }
}