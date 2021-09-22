package com.comcast.OrgTest;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test(groups="smokeSuite")
	public void creaateOrgTest() {
		System.out.println("execute createOrgTest");
	}
	
	
  @Test(groups="RegressionSuit")
	public void creaateOrgWithContactTest() {
		System.out.println("execute createOrgWithContactTest");
	}
  
  
	@Test(groups="RegressionSuit")
	public void deleteOrgTest() {
		System.out.println("execute deleteOrgTest");
	}


}
