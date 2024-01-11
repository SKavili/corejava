package com.audintel.Sandeep;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


import com.audintel.junit.suite.JUnitDemo;
import com.audintel.junit.suite.JunitTest;


@RunWith(Suite.class)

@Suite.SuiteClasses({JunitTest.class, JUnitDemo.class})
public class SuiteRunnerDemo {
}

