package com.audintel.mahesh;

public class FunctionalInterface {
    public static void main(String[] args) {
        Runnable r= () -> System.out.println("FI runnable");
        r.run();

        FI f1= (int a,int b)-> System.out.println(a*b);
        FI f2= (int a,int b)-> System.out.println(a+b);
        f1.operate(2,3);
        f2.operate(2,3);
    }
}

@java.lang.FunctionalInterface
interface FI{
    void operate(int a,int b);
}
