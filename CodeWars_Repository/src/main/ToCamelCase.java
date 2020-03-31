package main;

public class ToCamelCase {

	public static String toCamelCase(String input) {
		return input.contains("-") ? dashSeperator(input): underScoreSeperator(input);
	}

	private static String dashSeperator(String input) {
		String[] arr = input.split("-");
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(i > 0) {
				result = result + arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
			} else {
				result = arr[i];
			}
		}
		
		return result;
	}

	private static String underScoreSeperator(String input) {
		String[] arr = input.split("_");
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(i > 0) {
				result = result + arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
			} else {
				result = arr[i];
			}
		}
		return result;
	}

}
