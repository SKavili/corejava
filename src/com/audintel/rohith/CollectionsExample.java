package com.audintel.rohith;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<Integer>  ar= new ArrayList<>();
        ar.add(12);
        ar.add(34);
        ar.add(45);
        ar.add(1);
        //sorting
        Collections.sort(ar);
        //After sorting
        System.out.println(ar);

        System.out.println("Binary search");
        ArrayList<Integer>  ar2= new ArrayList<>();
        ar2.add(23);
        ar2.add(67);
        ar2.add(94);
        ar2.add(78);
        ar2.add(328);
        //finding
        System.out.println("key found at : "+Collections.binarySearch(ar2,94));

        System.out.println("Merging");
        ar.addAll(ar2);
        System.out.println(ar);


    }






}
