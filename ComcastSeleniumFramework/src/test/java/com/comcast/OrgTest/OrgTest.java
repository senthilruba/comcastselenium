package com.comcast.OrgTest;

import org.testng.annotations.Test;


	public class OrgTest {
		@Test(groups = "SmokeSuite")
		public void createContactTest() {
			System.out.println("execute createOrgTest");
			String BROWSER = System.getProperty("browser");
			String URL = System.getProperty("url");
			
			System.out.println("BROWSER=====>"+BROWSER+",URL=======>"+URL);
			
			
			
		}
		@Test(groups = "RegressionSuite")
		public void createContactWithOrgTest() {
			System.out.println("execte createOrgWithContactTest");
		}
		@Test(groups ="RegressionSuite")
		public void deleteContactTest() {
			System.out.println("execute deleteOrgTest");
		}

}
