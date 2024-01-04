package com.audintel.core.control;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;
import java.util.Vector;

public class SwitchDemo {
    public static void main(String[] args) {
        //m1();
        //m2();
        //m3();
        Vector <Integer> v = new Vector<>();
        v.add(11);
        v.add(21);
        m4(v);

        Stack <Integer> v1 = new Stack<>();
        v1.add(22);
        m4(v1);
    }

    private static void m4(Collection c) {

    Object o = switch(c) {

        case Stack s -> s.get(1);
        case Vector v -> v.get(1);
        case ArrayList a -> a.get(1);
        default -> new Vector<>();
    };

    System.out.println(o);

}
    private static void m3() {


        switch(3) {

            case 1:
                System.out.println("One");
                return ;
            case 2:
                System.out.println("Two");
                return ;
            case 3:
                System.out.println("Three");
                return ;
            default:
                System.out.println("Other value");
                return ;
        }
    }

    private static int m2() {

            switch(3) {

            case 1:
                System.out.println("One");
                return 1;
            case 2:
                System.out.println("Two");
                return 2;
            case 3:
                System.out.println("Three");
                return 3;
            default:
                System.out.println("Other value");
                return 9999;
        }
    }

    private static void m1() {
        switch(3) {

            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other value");
        }
    }

}
