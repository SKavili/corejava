package com.audintel.saitejam;

public class ThreadTest extends Thread {


    public static void main(String[] args) {
        Print r = new Print();
        ThreadTest1 t1 = new ThreadTest1(r);
        ThreadTest2 t2 = new ThreadTest2(r);
        t1.start();
        t2.start();
    }
}
class ThreadTest1 extends Thread {
    Print print;
    ThreadTest1(Print r){
        this.print=r;
    }
    @Override
    public void run() {
        print.process();
    }
}

class ThreadTest2 extends Thread {
    Print print;
    ThreadTest2(Print r){
        this.print=r;
    }
    @Override
    public void run() {
        print.process();
    }
}

class Print {
    public synchronized void process() {
//    public void process() {
        {
            for (int i = 1; i < 10; i++) {
                System.out.println( i);
            }
        }
    }
}



