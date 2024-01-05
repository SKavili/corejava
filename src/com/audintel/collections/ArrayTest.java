package com.audintel.collections;

public class ArrayTest {

    public static void main(String[] args) {
        int a[] = {4, 3, 4, 3, 2};
        int a1[] = a.clone();
        int a2[] = a;

        System.out.println(a.equals(a1));
        System.out.println(a.equals(a2));
        System.out.println(a == a1);
        System.out.println(a == a2);

        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);

        for(int i: a)
            System.out.println(i);

        for(int i: a1)
            System.out.println(i);

        for(int i: a2)
            System.out.println(i);
    }
}

