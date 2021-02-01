package utils;

import java.util.Random;
import org.apache.commons.lang.RandomStringUtils;

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
		int suffix = generateRandomDigits(6);
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
