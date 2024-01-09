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

        for (int item : l) {
            System.out.print(item + " ");
        }

//        int f=Collections.find(l,num->num%2==0);
    }
}

