package com.audintel.junit;


import junit.framework.TestCase;
import org.junit.Test;

public class JUnitDemo{
    int add(int a, int b){

        return a+b;
    }
    @Test
    public void testAdd(){

       int r=  add(1,2);
        TestCase.assertEquals(3, r);

    }

    @Test
    public void testAdd1(){

        int r=  add(1,2);
        TestCase.assertEquals(3, r);
    }

    @Test
    public void testF(){
        int r=add(1,2);
        TestCase.assertFalse("Sum is true",r!=3);
    }
}


