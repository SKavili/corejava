package com.audintel.exceptions;


public class MyException {
    public static void main(String[] args) throws CustomException {
        try {
            int i = 30 / 0;
        } catch (Exception e) {
            throw new CustomException(e.getMessage());
        }
    }
}
 class CustomException extends Exception{

     CustomException(){

         System.out.println("Test");
     }

     CustomException(String msg){

         System.out.println("Error occured in whareshouse module"+msg);
     }
}
