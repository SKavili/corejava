package com.audintel.rohith;
class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {

    }

    public static class holder {
        Singleton1 obj =new Singleton1();
    }
    public static  Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

public class Singleton {


    public static void main(String[] args) {

        Singleton1 singletonInstance = Singleton1.getInstance();


    }
}