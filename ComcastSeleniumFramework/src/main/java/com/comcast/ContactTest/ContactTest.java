package com.comcast.ContactTest;

import org.testng.annotations.Test;

public class ContactTest {
		@Test(groups="smokeSuite")
		public void creaateContactTest() {
			System.out.println("execute createContactTest");
		}
		
        @Test(groups="RegressionSuit")
		public void creaateContactWithOrgTest() {
			System.out.println("execute createContactWithOrgTest");
		}
        
        
		@Test(groups="RegressionSuit")
		public void deleteContactTest() {
			System.out.println("execute deleteContactTest");
		}
		
	}


