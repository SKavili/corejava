package com.audintel.singletonnav;

public class Exceptions {
    public static void main(String[] args){
        try{
           int i=50;
           int j=0;
           j=i/j;
        }
        catch(Exception e){
            System.out.println("this is an error");
            //e.printStackTrace();
        }
    }
}
