package com.ericsson.jcat.handson.testcases;

import org.testng.annotations.Test;

import se.ericsson.jcat.fw.assertion.JcatAssertApi;
import se.ericsson.jcat.fw.logging.JcatLoggingApi;

public class MyFirstTestCase {

	@Test
    public void myFirstTest() {
		// JcatLoggingApi.setTestCase("TC-FIRST", "First test");
		
		JcatLoggingApi.setTestCase("TC-MYFIRST-001", "A failing JCAT test case");
		 
		JcatLoggingApi.setTestStepBegin("Print Hello World!");
		JcatLoggingApi.setTestInfo("Hello World!");
		JcatLoggingApi.setTestStepEnd();
	 
		JcatLoggingApi.setTestStepBegin("Fail!");
		JcatAssertApi.assertTrue("False was not true", false);
		JcatLoggingApi.setTestStepEnd();
    }
}
