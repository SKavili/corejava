package com.audintel.core.control;

import java.util.ArrayList;

public class GenericsTest {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();
        al.add("Monday");
        al.add("Tue");
        al.add("Wed");
        display(al);

        ArrayList<Integer> al1 = new ArrayList();
        al1.add(1);
        al1.add(2);

        display(al1);
    }

    private static void display(ArrayList al) {

        for(Object s: al){
            System.out.println(s);
        }
    }
}
