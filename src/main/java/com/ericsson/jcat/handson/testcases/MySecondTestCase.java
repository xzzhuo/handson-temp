package com.ericsson.jcat.handson.testcases;

import org.testng.annotations.Test;

import se.ericsson.jcat.fw.logging.JcatLoggingApi;

public class MySecondTestCase {
  @Test
  public void mySecondTest() {
	  
	  // JcatLoggingApi.setTestInfo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	  
	  JcatLoggingApi.setTestCase("TC-MYFIRST-002", "MySecondTestCase");
		 
	  JcatLoggingApi.setTestStepBegin("Print MySecondTestCase");
	  JcatLoggingApi.setTestInfo("MySecondTestCase");
	  JcatLoggingApi.setTestStepEnd();
		
	  // JcatLoggingApi.setTestInfo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
  }
}
