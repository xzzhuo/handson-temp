package com.ericsson.jcat.handson.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import se.ericsson.jcat.fw.logging.JcatLoggingApi;

public class MyThirdTestCase {
  @Test
  public void myThirdTest() {
	  JcatLoggingApi.setTestCase("TC-MYFIRST-003", "MyThirdTestCase");
		 
		JcatLoggingApi.setTestStepBegin("MyThirdTestCase: assert false");
		JcatLoggingApi.setTestInfo("MyThirdTestCase");
		
		Assert.assertTrue(false);
		
		JcatLoggingApi.setTestStepEnd();
  }
}
