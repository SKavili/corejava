package com.audintel.collections;


import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        Generics g = new Generics();
        g.printDatatype(77);
        g.printDatatype("SS");

        GTest<String> g1 = new GTest<>("S");
        GTest<Object> go = new GTest<>("S");

    }

    <T> void printDatatype( T t){
        System.out.println(t.getClass());
    }
}

class GTest <T>{

    T t1;
    ArrayList<T> al1= new ArrayList<>();

    GTest(T t){
        System.out.println("In Gtest constructor"+t.getClass());

        ArrayList<T> al9= new ArrayList<>();
        ArrayList<String> al = new ArrayList<>();

    }
}
