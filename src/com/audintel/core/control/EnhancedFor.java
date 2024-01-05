package com.audintel.core.control;

import java.util.ArrayList;

public class EnhancedFor {

    public static void main(String[] args) {


//m1();
        m2();
    }

    private static void m1() {
        ArrayList al = new ArrayList();

        for(int i=1; i<10; i++)
            al.add(i);

        for(int i=0; i<al.size(); i++)
            System.out.println(al.get(i));

        for(Object i  :al)
            System.out.println(i);
    }
    private static void m2() {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=1; i<10; i++)
            al.add(i);

        for(int i=0; i<al.size(); i++)
            System.out.println(al.get(i));

        for(Integer i  :al)
            System.out.println(i);
    }

}


