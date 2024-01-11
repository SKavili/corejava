package com.audintel.junit.suite;

import com.audintel.junit.JUnitDemo;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runners.Suite;


public class JunitTest {
    int add(int a, int b) {
        return a + b;
    }

    @Test
    public void testAdd() {
        int r = add(1, 2);
        TestCase.assertFalse("The result should not be false.", r == 3);
    }

    @Test
    public void testAdd1() {
        int r = add(2, 3);
        TestCase.assertFalse("The result should not be false.", r==3);
    }
}

