package com.audintel.statictest;

public class statictest {
    static{
        System.out.println("static block1");
    }
    static{
        System.out.println("static block2");
    }
    public static void main(String[] args) {
        System.out.println("main");
        new statictest().v1();
        v2();
    }
    void v1(){

    }
    static void v2(){
        System.out.println("static method");
    }
}
