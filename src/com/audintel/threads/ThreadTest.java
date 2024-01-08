package com.audintel.threads;

public class ThreadTest extends Thread{

    String msg="";
    ThreadTest(String msg){
        this.msg=msg;
    }

    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest("T1#######");
ThreadTest t2 = t1;
t1.start();
t2.start();
    }

    @Override
    public void run (){
        synchronized(this) {
            process();
        }
    }
     public synchronized void process() {
       {
            for (int i = 1; i < 10; i++) {
                System.out.println(msg + i);
            }
        }
    }


}
