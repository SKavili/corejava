package com.audintel.Sandeep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CollectionsDemo {

    public static void main(String[] args)
    {
        List<Integer> l = new ArrayList<>();

        l.add(6);
        l.add(2);

        Collections.addAll(l, 4,3,8,5,1,9);

        Collections.sort(l);


        for (int i : l) {
            System.out.print(i + " ");
        }

        System.out.println();

        l.sort(Collections.reverseOrder());

        for (int i : l) {
            System.out.print(i + " ");
        }
        System.out.println();

//        int f=Collections.find(l,num->num%2==0);

        int ind=Collections.binarySearch(l,5);
        System.out.println(ind);

        List<Integer> list1 = new ArrayList<>(List.of(1, 3, 5));
        List<Integer> list2 = new ArrayList<>(List.of(2, 4, 6));
        list1.addAll(list2);
        for(int i:list1){
            System.out.print(i + " ");
        }

    }
}

