package com.audintel.threads;
// Java Program to demonstrate the
// use of Volatile Keyword in Java

import java.util.logging.Logger;

public class VolatileTest {

    //private static  int MY_INT = 0;
    private static volatile int MY_INT = 0;

    public static void main(String[] args)
    {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override public void run()
        {
            int local_value = MY_INT;
            while (local_value < 50) {
                if (local_value != MY_INT) {

                    System.out.println("Info"+
                            "Got Change for MY_INT : {0}"+
                            MY_INT );

                    local_value = MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override public void run()
        {
            int local_value = MY_INT;
            while (MY_INT < 50) {
                System.out.println("Info"+
                        "Incrementing MY_INT to {0}"+
                        local_value + 1);

                MY_INT = ++local_value;
//                try {
//                   // Thread.sleep(1);
//                }
//                catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }
}