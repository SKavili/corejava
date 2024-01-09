package com.audintel.yagnesh;

//public class Funtionalinterface implements  MyFunctionalInterface{
//    @Override
//    public void display(){
//        System.out.println("Hai Hello");
//    }
//
//    @Override
//    public void addnums(int a, int b) {
//        MyFunctionalInterface.super.addnums(a, b);
//    }
//
//    public static void main(String[] args) {
//        Funtionalinterface ob=new Funtionalinterface();
//        ob.display();
//        ob.addnums(2,5);
//    }
//}
public class Functionalinterface{
    MyFunctionalInterface obj=(int a,int b)->{
        System.out.println(a+b);
    };

    public static void main(String[] args) {
        Functionalinterface ob=new Functionalinterface();
        ob.obj.addnums(4,66);
    }
}

@FunctionalInterface
interface MyFunctionalInterface
{
     void addnums(int a, int b) ;
}