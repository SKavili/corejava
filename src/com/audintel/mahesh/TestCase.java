package com.audintel.mahesh;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestCase {

    public String strMatch(){
        return "Hello";
    }

    @Test
    public void Test1(){
        assertTrue("==","Hello"==strMatch());
    }
}

