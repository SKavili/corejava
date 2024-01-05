package com.audintel.constructors;

class Parent {


   public Parent(String s) {
    }
}
public class ConstructorDemo {
    ConstructorDemo(){

    }
    ConstructorDemo(int a){

    }

    public static void main(String[] args) {

        ConstructorDemo cd = new ConstructorDemo();
        ConstructorDemo cd1 = new ConstructorDemo(12);
      //  Parent p = new Parent();
       // System.out.println(p);
        System.out.println(new Parent("SS"));
        System.out.println("in main");

        ConstructorDemo1 cd11 = new ConstructorDemo1("");
    }
}

class ConstructorDemo1 {

    ConstructorDemo1(String a){

    }
}
