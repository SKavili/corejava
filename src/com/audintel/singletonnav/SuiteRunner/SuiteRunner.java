package com.audintel.singletonnav.SuiteRunner;


import com.audintel.singletonnav.junitprac;
import org.junit.runner.RunWith;
import com.audintel.junit.suite.JunitTest;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({junitprac.class,JunitTest.class})
public class SuiteRunner {

}
