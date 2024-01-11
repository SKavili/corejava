package com.audintel.rohith.MyTestSuite;

import junit.framework.TestCase;
import org.junit.Test;

public class JunitDemo {
    int square(int a){

            return a*a;
        }
        @Test
        public void testSquare(){

            int r=  square(2);
            TestCase.assertFalse(4!=r);
        }

        @Test
        public void testSquare1(){

            int r=  square(3);
            TestCase.assertFalse(9!= r);
        }
    }


