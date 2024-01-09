package com.audintel.singletonnav;

import java.util.*;
public class Collectionsim {
    public static void main(String[] args){
        ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(8,34,53,4,5,7,1,8,3,21,54,2));

        System.out.println("Original arraylist"+ar);
        System.out.println("Index of 7: "+ar.indexOf(7));
        System.out.println("BinarySearch of 7  " + Collections.binarySearch(ar,7));
        ArrayList<Integer> ar2=new ArrayList<>();
        ar2.addAll(ar);
        System.out.println("New ArrayList ar2 is"+ar2);
        Collections.sort(ar);
        System.out.println("Sorted arraylist" + ar);


    }
}
