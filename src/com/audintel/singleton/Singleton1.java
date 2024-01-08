package com.audintel.singleton;

public class Singleton1 {
    private Singleton1(){

    }
    private static Singleton1 sObj = null;

     synchronized public static Singleton1 getinstance()
    {
        if(sObj == null)
        sObj =  new Singleton1();

        return sObj;
    }
}
