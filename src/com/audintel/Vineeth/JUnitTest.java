package com.audintel.Vineeth;


import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runners.Suite;

@Suite.SuiteClasses({JUnitTest.class, demojunit.class})
public class JUnitTest{
    int add(int a, int b) {
        return a + b;
    }

    @Test
    public void testAdd() {
        int r = add(1, 2);
        TestCase.assertFalse("The result should not be false.", r == 5);
    }

    @Test
    public void testAdd1() {
        int r = add(2, 3);
        TestCase.assertFalse("The result should not be false.", r==3);
    }
}

