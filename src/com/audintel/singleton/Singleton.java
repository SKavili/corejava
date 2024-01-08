package com.audintel.singleton;

public class Singleton {
    private static Singleton instance;
    private static class singletonHolder
    {
        public static final Singleton instance=new Singleton();
    }
    public Singleton getinstance()
    {
        return singletonHolder.instance;
    }
}
