package com.audintel.singletonnav;

public class FuctionalInterfacep {
    SAM S1=(int a,int b) -> a+b;
    public static void main(String[] args){
        FuctionalInterfacep fi=new FuctionalInterfacep();
        System.out.println(fi.S1.add(1,2));
        //Samp s1=new Samp();
       // System.out.println(s1.add(1,2));
    }

}
@FunctionalInterface
interface SAM{
    int add(int a,int b);
}
//class Samp implements SAM{
//
//    public int add(int a,int b) {
//        return a+b;
//    }
//}
