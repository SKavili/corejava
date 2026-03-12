package com.audintel.Sandeep;
public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableDemo());
        Thread t2 = new Thread(new RunnableDemo());
        t1.start();
        t2.start();

    }
}


