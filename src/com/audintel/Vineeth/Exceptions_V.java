package com.audintel.Vineeth;

public class Exceptions_V {
    public static void main(String[] args) {
        Exceptions_V vineeth = null;

        simpleDemo();
        try{
            System.out.println("Try Block");
            int a=10/0;
        }catch (Exception e) {
            System.out.println("Catch Block main");
        }
    }
    public static void simpleDemo() {

        try{

            System.out.println("Try Block");

        }catch (Exception e){
            System.out.println("Catch Block");
        }
    }
}
