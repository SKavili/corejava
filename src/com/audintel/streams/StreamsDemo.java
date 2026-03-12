package com.audintel.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
    m1();
     //m2();
    }

    private static void m1() {

        Stream<String> s = Stream.empty();
        System.out.println(s.count());
        System.out.println(s);
        Stream st = Stream.of("5",'5', 9);
        st.forEach((n) -> System.out.println(n));

        Stream st1 = Stream.of("5",'5', 9);
        st1.forEach(n -> System.out.println(n));

        int n =90;
        n=n+1;
        n++;
    }
    private static void m2() {

        ArrayList<String> al = new ArrayList<>();
        al.add("Jan");
        al.add("Feb");
        al.add("Mar");
        Stream<String> s = al.stream();
        //System.out.println(s.count());
       //s.forEach((k) -> System.out.println(k));

       boolean b =  s.anyMatch((a) -> a == "Sep");
        System.out.println(b);
        System.out.println(90==33);

        boolean b1 = 90==30;


    }

}
