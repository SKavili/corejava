package com.audintel.yagnesh;

public class Exceptions {
    public static void main(String[] args) throws Myexception{
        try{
            int i=100/0;

        }catch (Exception e){
            throw new Myexception(e.getMessage());
        }
    }
}
class Myexception extends Exception{
    Myexception(){
        System.out.println("customized error message from constructor");
    }
    Myexception(String s){
        System.out.println("customized error message from parameterized constructor "+s);
    }
}
