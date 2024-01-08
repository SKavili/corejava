package com.audintel.yagnesh;

public class Statictest {
    Statictest(){
        System.out.println("Constructor");
    }
    static{
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        new Statictest();// constructor call
        Statictest.m();//static method call
    }
    static void m(){
        System.out.println("Static method");
    }

}
