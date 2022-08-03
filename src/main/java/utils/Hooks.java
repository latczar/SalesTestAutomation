package utils;

import io.cucumber.java.Before;

public class Hooks {
	
	static String env;
	static String user;
	
	@Before
		public static String testEnvironment() throws Throwable {
		
		//Provide environment in the variable "env" below; QA, UAT, or PROD
		
		env = "UAT";
		return env;
	}
		
		public static String testUser() throws Throwable {
			
			//Provide user in the variable "user: below to determine which user account to use in the sandbox/prod environment/s
			/*
			 For QA/UAT/PROD env:
			 
			- QA SPD, UAT SPD, PROD SPD
			- QA ID, UAT ID, PROD ID
			- QA ND, UAT ND, PROD ND
			
			*/
			user = "UAT SPD";
			return user;
		}
}
