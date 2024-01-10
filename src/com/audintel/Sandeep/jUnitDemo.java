package com.audintel.Sandeep;

import junit.framework.TestCase;
import org.junit.Test;

public class jUnitDemo {
    int add(int a,int b){
        return a +b;
    }
    @Test
    public void test(){
        int res=add(1,2);
//        TestCase.assertTrue(true);
        TestCase.assertTrue("True",res==3);
    }
}
