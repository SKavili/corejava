package com.audintel.singletonnav;

import org.w3c.dom.ls.LSOutput;

public class lamrunnable {
    public static void main(String[] args){
        Runnable R1=()-> System.out.println("This is through lambda");
        Thread T1=new Thread(R1);
        T1.start();
    }
}
