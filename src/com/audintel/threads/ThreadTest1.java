package com.audintel.threads;

public class ThreadTest1 extends Thread {


    public static void main(String[] args) {
        R1 r = new R1();
        ThreadTest2 t1 = new ThreadTest2(r);
        ThreadTest3 t2 = new ThreadTest3(r);
        t1.start();
        t2.start();
    }
}
     class ThreadTest2 extends Thread {
          R1 r1;
         ThreadTest2(R1 r){
             this.r1=r;
         }
         @Override
         public void run() {
                r1.process();
         }
     }

class ThreadTest3 extends Thread {
    R1 r1;
    ThreadTest3(R1 r){
        this.r1=r;
    }
    @Override
    public void run() {
        r1.process();
    }
}

  class R1 {
     public synchronized void process() {
         {
             for (int i = 1; i < 10; i++) {
                 System.out.println( i);
             }
         }
     }
 }



