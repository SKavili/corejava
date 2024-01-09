package com.audintel.rohith;

public class FuncInterface {

    public static void main(String[] args) {
        int num1=3;
        Cube c=(int a)->a*a*a;
        System.out.println(c.calculate(num1));


    }
}
@FunctionalInterface
interface Cube{
    int calculate(int num);
}
