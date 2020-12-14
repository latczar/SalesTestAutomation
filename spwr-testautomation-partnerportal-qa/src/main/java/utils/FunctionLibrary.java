package utils;

import java.io.File;
import java.util.Properties;
import java.util.Random;
import utils.Constant;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;

public class FunctionLibrary {
	
	public String genarateRandomString(int length, boolean useLetters, boolean useNumbers) throws Exception {
		return RandomStringUtils.random(length, useLetters, useNumbers);
	}
	
	public static int generateRandomDigits(int numberOfDigits) {
	    int m = (int) Math.pow(10, numberOfDigits - 1);
	    return m + new Random().nextInt(9 * m);
	}
	
	public static String generateContactNumber() {
		String mobile = "" ;
		int suffix = generateRandomDigits(10);
	    mobile = "" + suffix;
		return mobile;
	}
	
	public static String generateResidentialContactNumber() {
		String mobile = "" ;
		int suffix = generateRandomDigits(11);
	    mobile = "" + suffix;
		return mobile;
	}
}
