package com.comcast.ContactTest;
import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "SmokeSuite")
	public void createContactTest() {
		System.out.println("exicte ctreateContactTest");
		
	}
	@Test(groups = "RegressionSuite")
	public void createContactWithOrgTest() {
		System.out.println("execte createContactWithOrgTest");
	}
	@Test(groups = "RegressionSuite")
	public void deleteContactTest() {
		System.out.println("execute deleteContactTest");
	}


}
