package com.audintel.statictest;

public class StaticBlockTest {
    StaticBlockTest(){
        System.out.println("In Constructor");
    }
    static{

        System.out.println("In Static Block1");
    }
    static{

        System.out.println("In Static Block2");
    }
    public static void main(String[] args) {


            System.out.println("In Main");

        new StaticBlockTest().m1();
        m2();
    }

    void m1(){

    }
    static void m2(){
         {

            System.out.println("In Static method");
        }
    }
}
