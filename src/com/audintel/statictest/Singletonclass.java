package com.audintel.statictest;

public class Singletonclass {
    private  static  Singletonclass Instance;

    private Singletonclass(){}

    private static class Holder{
        private static final Singletonclass Instance=new Singletonclass();
    }
    public Singletonclass getInstance(){
            return Holder.Instance;
    }

}
