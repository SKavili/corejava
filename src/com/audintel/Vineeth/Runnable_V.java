package com.audintel.Vineeth;

public class Runnable_V implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread: " + i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable_V());
        Thread t2 = new Thread(new Runnable_V());
        t1.start();
        t2.start();

    }
}

