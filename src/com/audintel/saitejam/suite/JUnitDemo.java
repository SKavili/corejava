package com.audintel.saitejam.suite;



import junit.framework.TestCase;
import org.junit.Test;

public class JUnitDemo extends AddNumbers {

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


