package com.audintel.mahesh;

public class RunnableTest {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        Thread t=new Thread(t1);
        t.start();
    }
}

 class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread from runnable "+Thread.currentThread().getName());
    }

}
