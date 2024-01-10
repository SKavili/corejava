package com.audintel.collections;



import java.util.Optional;

@FunctionalInterface
interface Demo{
    int m1(int m);
}

public class OptionalDemo  {

    public static void main(String[] args) {
        System.out.println("In main method");

        int []a = new int[3];
        Optional <Integer> obj1 = Optional.ofNullable(a[0]);
        System.out.println("2222222");
        System.out.println(obj1);
        System.out.println(a[0]);

        String[] str = new String[10];
        System.out.println(str[0]);

        Optional <String> objs = Optional.ofNullable(str[0]);
        String s = str[0];
        if(s!=null)
            System.out.println(s.length());

        if(objs.isPresent())
            System.out.println(s.length());


        System.out.println("2222222");
boolean b = obj1.isPresent();
        System.out.println(b);

       String s22 =  obj1.toString();
        System.out.println(s22);
        Demo d = (int i) -> {
          return 1000;
        };
        System.out.println(d.m1(100));

    }

    public void addTest(){





    }



}




