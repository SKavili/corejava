package com.audintel.Vineeth;


import com.audintel.junit.suite.JUnitDemo;
import com.audintel.junit.suite.JunitTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({JUnitTest.class, demojunit.class})
public class SuiteRunner {
}
