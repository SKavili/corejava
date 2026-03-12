package com.audintel.yagnesh;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionstest {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(12);
        a.add(1);
        a.add(87);
        a.add(3);
        Collections.sort(a);

        System.out.println(a);
        if(a.contains(1)){
            System.out.println("Element is found");
        }else{
            System.out.println("Element is not in list");
        }
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        a1.add(32);
        a1.add(12);
        a2.add(6);
        a2.add(52);
        a1.addAll(a2);

            System.out.print(a1);
    }

}
