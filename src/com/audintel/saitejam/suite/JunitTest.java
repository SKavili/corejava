package com.audintel.saitejam.suite;

import junit.framework.TestCase;
import org.junit.Test;


public class JunitTest {
    public boolean hasVotingEligibility(int age){
        return age>=18;
    }

    @Test
    public void testFalse1(){
        boolean isEligible = hasVotingEligibility(15);
        TestCase.assertFalse("Not Eligible",isEligible);
    }
    @Test
    public void testFalse2(){
        boolean isEligible = hasVotingEligibility(48);
        TestCase.assertFalse("Not Eligible",isEligible);
    }
}

