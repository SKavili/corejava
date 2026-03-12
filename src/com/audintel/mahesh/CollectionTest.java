package com.audintel.mahesh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class CollectionTest {
    public static void main(String[] args) {
//        Without generics
//        ArrayList al=new ArrayList();
//        al.add(1);
//        al.add("abcc");
//        System.out.println(al);

        ArrayList <Integer> al = new ArrayList<>();
        al.add(1);
        al.add(10);
        al.add(3);
        al.add(3);
        al.add(6);
        al.add(2);

        System.out.println("Before Sorting "+al);
        Collections.sort(al);
        System.out.println("After sorting " +al);

        //merging
        HashSet<Integer> hs=new HashSet<>();
        hs.add(15);
        hs.addAll(al);
        System.out.println("Hash Set elements \n"+hs);

        System.out.println(al.get(3));
        System.out.println(al.contains(10));
        System.out.println(al.indexOf(3));
        System.out.println(Collections.frequency(al,3));
        System.out.println(Collections.binarySearch(al,3));
    }
}


