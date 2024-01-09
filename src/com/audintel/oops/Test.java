package com.audintel.oops;

public class Test {
    public static void main(String[] args) {
        Inheritance i = new Child();
        i.m1();
//        i.m2();
//        i.m3();
        i = new Inheritance();
        i.m1();
//        i.m2();

    }
}

class Child extends Inheritance {
    public void m1(){
        System.out.println("Child Method");
    }
     void m2(){
        System.out.println("Final Method");
    }

    void m3(){
        System.out.println("Final Method");
    }
}
class Inheritance {
    public void m1(){
        System.out.println("Parent Method");
    }

    private void m2(){
        System.out.println("Final Method");
    }
}
