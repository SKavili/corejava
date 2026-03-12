package com.audintel.yagnesh;

import com.audintel.Vineeth.Runnable_V;

public class Runnable_test implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("Thread implements: "+i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable_test());
        Thread t2 = new Thread(new Runnable_test());
        t1.start();
        t2.start();
    }
}
