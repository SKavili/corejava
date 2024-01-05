package com.audintel.accessmodifer;

import java.util.Date;
import java.util.Vector;

public class AccessModifier {
    public    String  strPublic        = "strPublic";
    protected String  strProtected     = "strProtected";
              String  strDefault       = "strDefault";
    private   String  strPrivate       = "strPrivate";

    public static void main(String[] args) {

        double  dblValue   = 10.0;


    }
}

class Child extends AccessModifier {
    public void m(Object obj){
        AccessModifier a = new Child();
        Child c = (Child) obj;

        Object obj1 = new String();
        Object obj2 = new Vector<>();
        Object obj3 = new Date();

    }
}