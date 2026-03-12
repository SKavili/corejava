package com.audintel.rohith.MyTestSuite;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;



    @RunWith(Suite.class)

    @Suite.SuiteClasses({JunitTestDemo.class, JunitDemo.class})
    public class SRunner {
    }

