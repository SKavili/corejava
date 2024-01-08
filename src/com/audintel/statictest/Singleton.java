package com.audintel.statictest;

public class Singleton {
    public static void main(String[] args) {
        Single st=Single.getInstance();
        System.out.println(st.x);
    }
}

class Single{
    public int x=10;

    private Single(){};
    private static class SI{
        public static Single  obj = new Single();
    }

    public static Single getInstance(){
        return SI.obj;
    }
}