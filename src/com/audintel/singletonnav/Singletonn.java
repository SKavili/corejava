package com.audintel.singletonnav;

public class Singletonn {
    public static void main(String[] args){
        Single st= Single.getInstance();
        System.out.println(st.a);
    }
}
class Single{
    public int a=2;
    private Single(){};
        public static Single obj = new Single();

    public static Single getInstance(){
        return Single.obj;
    }
}
