package com.audintel.singletonnav;

import junit.framework.TestCase;
import org.junit.Test;

public class junitprac {
    int add(int a,int b){
    return a+b;
    }
    @Test

    public void Testadd() {
        int r = add(1, 6);
        boolean b=(r==3);
        System.out.println(b);
        TestCase.assertFalse("Notsame",b);
    }



}
