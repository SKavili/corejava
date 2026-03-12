package com.audintel.Vineeth;

public class Static_V {
    public static void main(String[] args) {
       // vineeth(5); static to non static
        Static_V obj = new Static_V();
        obj.vineeth(5);// now we can access non-static.
        yagnesh(10); //we can access directly
        //obj.yagnesh(10); not applicable
        Static_V.yagnesh(20);//using a class name.
        int r=sum(10,5);
        System.out.println(r);
    }
    public void vineeth(int v){
        v=v+1;
        while(v<40){
            v=v+1;
        }
        System.out.println("Vineeth"+v);
    }
    public static void yagnesh(int h){
        h=h+1;
        while(h<1000){
            h*=5;
        }
        System.out.println("Yagnesh"+h);
    }
    public static int sum(int v,int h){
        int a=0;
        a=v+h;
        return a;
    }
}
