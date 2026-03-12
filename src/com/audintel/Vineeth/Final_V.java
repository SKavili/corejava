package com.audintel.Vineeth;

public class Final_V {
    public static void main(String[] args) {
        final int v=0;
       // v=v+1; cannot be changed.
    }
    final public int vineeth(){
        int a=5;
        System.out.println(a);
        return a;
    }
}
class yagnesh extends Final_V{
    public static void main(String[] args) {
        final int g=0;
    }
   /* public int vineeth(){

    }*/
}
