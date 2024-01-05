package com.audintel.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class CollectionClass {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        a.add(19);
        a.add(12);   a.add(12);   a.add(11);   a.add(3);  a.add(12);   a.add(111);

        int min = 9999;
        for(Integer i: a){
            if (i < min) min=i;
        }
        System.out.println(min);
        int result = (int) Collections.min(a);
        System.out.println(result);

        System.out.println(a);
         Collections.sort(a);
        System.out.println(a);
    }
}
