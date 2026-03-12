package com.audintel.saitejam;

public class SingletonTest {
    public static void main(String[] args) {
//        SingletonClass s = new SingletonClass();
        SingletonClass s1 = SingletonClass.getInstance();

    }
}

class SingletonClass{
    private static SingletonClass s = null;
    private SingletonClass(){
        System.out.println("Object Initialised");
    }

    public static synchronized SingletonClass getInstance(){
        if(s==null) s = new SingletonClass();
        return s;
    }
}
