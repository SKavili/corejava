package com.audintel.Vineeth;
@FunctionalInterface
interface Functional_Interface{
    void product(int dist,int pointperkms);
}
public class FI {
    Functional_Interface fi = (int a,int b)->System.out.println(a*b);
    public static void main(String[] args) {
        FI vineeth= new FI();
        vineeth.fi.product(1000,1);
    }
}
