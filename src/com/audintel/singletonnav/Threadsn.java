package com.audintel.singletonnav;

public class Threadsn extends Thread{
    String msg="";
    Threadsn(String msg){
        this.msg=msg;
    }
    public static void main(String[] args){
        Threadsn t1=new Threadsn("T1");
        Threadsn t2=new Threadsn("T2");
        t1.start();
        t2.start();

    }
//    @Override
    public void run(){
        for(int i=1;i<100;i++) System.out.println(msg+" "+i);
    }
}
