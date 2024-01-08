package com.audintel.exceptions;

public class ExceptionTest {

    public static void main(String[] args) {
        simpleDemo1();
    }

    private static void simpleDemo() {

        try{
            System.out.println("Try Block");
        }catch (Exception e){
            System.out.println("Catch Block");
        }
    }
    private static void simpleDemo1() {

        try{
            System.out.println("Try Block");
            int a = 30/10;
            Object obj= null;
            obj.wait();
        }
        catch (ArithmeticException e){
            System.out.println("Catch Block1: " +e);
            System.out.println("Catch Block: " +e.getMessage());
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Catch Block2: " +e);
            System.out.println("Catch Block: " +e.getMessage());
            e.printStackTrace();
        }

    }

}
