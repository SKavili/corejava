package com.audintel.singletonpkg;

public class SingletonTest {
    public static void main(String[] args) {
//        SingletonClass s = new SingletonClass();
        SingletonClass s1 = SingletonClass.getInstatnce();

    }
}

class SingletonClass{
    private static SingletonClass s;
    private SingletonClass(){
        System.out.println("Object Initialised");
    }

    public static SingletonClass getInstatnce(){
        s = new SingletonClass();
        return s;
    }
}
