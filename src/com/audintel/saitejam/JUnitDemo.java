package com.audintel.saitejam;

import junit.framework.TestCase;
import org.junit.Test;

public class JUnitDemo {
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
