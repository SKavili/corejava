package com.audintel.statictest;

public class singleton_v {
    private static singleton_v instance;
    private singleton_v(){};
    private static class singletonholder{
        private static final singleton_v instance = new singleton_v();
    }
    public  singleton_v get_instance(){
        return singletonholder.instance;
    }
}
