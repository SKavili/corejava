package com.audintel.functionalinterface;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
// we cannt create lambda functions for non functional interfaces.
public class NonSAM{
    public static void main(String[] args) {
        int u=9;
        System.out.println((u*7));
        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        for(String s: list)
            System.out.println(s);

        // foreach takes fucntional interface / lambda implementation as parameter
        list.forEach(
                (n)->{


                    System.out.println((n.substring(0,3)));

                    System.out.println((n.substring(0,3)));
                    System.out.println((n.substring(0,3)));
                }
        );

        list.forEach(System.out::println);

        list.forEach((n)-> System.out.println((n.substring(0,3))));


    }
}