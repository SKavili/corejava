package com.audintel.mahesh;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestCase2 {

        public String strMatch(){
            return "Hello";
        }

        @Test
        public void Test2(){
            assertTrue("Comparison with string hello .equals",new String("Hello").equals(strMatch()));
        }
    }


