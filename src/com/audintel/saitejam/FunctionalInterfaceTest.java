package com.audintel.saitejam;

import java.sql.SQLOutput;

public class FunctionalInterfaceTest {
    PowerVal p = (a,b) -> Math.floor(Math.log(a)/Math.log(b));
    public static void main(String[] args) {
        double Power = new FunctionalInterfaceTest().p.powerVal(6,2);
        System.out.println("Power val: "+Power);
    }
}

@FunctionalInterface
interface PowerVal{
    abstract double powerVal(int a, int b);
}
