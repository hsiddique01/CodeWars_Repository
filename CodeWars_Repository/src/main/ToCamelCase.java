package main;

import org.junit.Test;

public class ToCamelCase {

	@Test
	public static String toCamelCase(String input) {
		return input.contains("-") ? dashSeperator(input): underScoreSeperator(input);
	}

	@Test
	private static String dashSeperator(String input) {
		String[] arr = input.split("-");
		String result = "";
		for(String s: arr) {
			if(!s.equals(arr[0])) {
				result = result + s.substring(0,1).toUpperCase() + s.substring(1);
			} else {
				result = s;
			}
		}
		return result;
	}
	
	@Test
	private static String underScoreSeperator(String input) {
		String[] arr = input.split("_");
		String result = "";
		for(String s: arr) {
			if(!s.equals(arr[0])) {
				result = result + s.substring(0,1).toUpperCase() + s.substring(1);
			} else {
				result = s;
			}
		}
		return result;
	}

}
