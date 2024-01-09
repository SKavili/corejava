package com.audintel.singletonnav;

public class Ethrows {
    public static void main(String[] args){
        A obj = new A();
        try {
            obj.show();
        }
        catch(Exception e){
            System.out.println("This is not my responsibility");
        }
    }
}
class A  {
    public void show() throws Exception{
        int i=32;
        int j=0;
        i=i/j;
    }
}
