package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCode {
	public static void main(String[] args) {

		String pinCode = "400088B";
		String regex = "^[1-9]{1}[0-9]{5}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pinCode);
		boolean result = matcher.matches();
		if (result)
			System.out.println("Valid PinCode");
		else
			System.out.println("InValid PinCode");
	}
}
