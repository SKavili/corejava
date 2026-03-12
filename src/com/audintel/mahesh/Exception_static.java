package com.audintel.mahesh;

public class Exception_static extends Thread{
    public static int x=0;

    Exception_static(){

    }

    String name="";
    Exception_static(String s){
        name =s;
    }

    CommonClass c1;
    Exception_static(CommonClass c){
        this.c1=c;
    }

    public static void main(String[] args) {
        Exception_static ex1=new Exception_static();
        Exception_static ex2= new Exception_static();

        //updating ex1
        ex1.x++;
        System.out.println("Class value of static variable "+Exception_static.x);
        System.out.println("ex2 value of static variable "+ex2.x);

        try{
            throw new MyException("Custom Exception Called");
        }
        catch(MyException ex){
            ex.getMessage();
        }
        finally {
            System.out.println("In Finally block");
        }

        Exception_static t1=new Exception_static("t1");
        Exception_static t2=new Exception_static("t2");
        //t1.start();
        //t2.start();

        CommonClass obj=new CommonClass();
        Exception_static t3 =new Exception_static(obj);
        Exception_static t4=new Exception_static(obj);
        t3.start();
        t4.start();
    }

    @Override
    public void run() {
        System.out.println("In run of thread"+name);
        c1.print();
    }
}

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
        System.out.println("Exception caught: "+msg);
    }
}


class CommonClass{
    int y=10;
    synchronized void print(){
        for(int i=0;i<5;i++){
            System.out.println(y);
            y*=2;
        }
    }
}

