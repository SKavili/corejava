package com.audintel.saitejam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsTest{
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(4,8,45,34,576,7,45344,235456,56,8));
        ArrayList<Integer> arCopy = (ArrayList) ar.clone();
        System.out.println("Original list: " + ar);

        //indexOf()
        System.out.println("index of number 45 is : " + ar.indexOf(45));
        System.out.println("index of number 2 is : " + ar.indexOf(2));

        //binarySearch()
        System.out.println("index of number 45 is : " + Collections.binarySearch(ar,45));
        System.out.println("index of number 2 is : " + Collections.binarySearch(ar,2));

        // sort()
        Collections.sort(ar);
        System.out.println("Sorted List: " + ar);

        //addAll()
        ArrayList<Integer> ar2 = new ArrayList<>();
        ar2.addAll(arCopy);
        System.out.println("New ArrayList ar2 is : " + ar2);
    }

}