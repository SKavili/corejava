package com.audintel.Vineeth;

import com.audintel.junit.suite.AddNumbers;
import junit.framework.TestCase;
import org.junit.Test;

public class demojunit extends AddNumbers {
    int add(int a,int b){
        return a+b;
    }
    @Test
    public void test1(){
        int n=add(2,8);
        TestCase.assertEquals(10,n);
    }
    @Test
    public void test2(){
        int n=add(10,3);
        TestCase.assertTrue(n==13);
    }
}
