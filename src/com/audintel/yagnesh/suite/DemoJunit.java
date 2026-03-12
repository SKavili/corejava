package com.audintel.yagnesh.suite;


import junit.framework.TestCase;
import org.junit.Test;

public class DemoJunit {
    int multiply(int a,int b){
        return a*b;
    }
    @Test
    public void test1(){
        int n=multiply(2,8);
        TestCase.assertEquals(16,n);
    }
    @Test
    public void test2(){
        int n=multiply(10,3);
        TestCase.assertTrue(n==10);
    }
}

