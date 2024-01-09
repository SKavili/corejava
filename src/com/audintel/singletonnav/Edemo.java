package com.audintel.singletonnav;

public class Edemo {
    public static void main(String[] args) {
        String s="nav";
        try{
            if(s.equals("nav")) throw new Myexception();
        }
        catch(Myexception e){
            System.out.println(e.message());
        }

    }
}
class Myexception extends Exception{
    public String message(){
        return "This is an error";
    }
}
