package com.audintel.singletonnav;

public class Runnablep {
    public static void main(String[] args) {
        Mythread t2 = new Mythread();
        Thread t = new Thread(t2);
        t.run();
    }
}

class Mythread implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread from runnable");
    }
}