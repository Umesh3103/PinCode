package com.calculation;
import java.util.regex.*;

public class PinCode {
	private static final Pattern NAME_PATTERN = Pattern.compile("[0-9]{6}");
    private static boolean checkName(String pin) {
        return NAME_PATTERN.matcher(pin).matches();
    }

	public static void main(String[] args) {
		System.out.println("Welcome to pin code pattern problem");
		boolean flag = checkName("400088");
		System.out.println(flag);
	}
}
