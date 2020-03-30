package main;

public class VasyaClerkLine {

	public static String Tickets(int[] input) {
		int count25 = 0;
		int count50 = 0;
		if (input == null || input.length == 0) {
			return "NO";
		}
		for (int i: input) {
			if (i == 25) {
				count25++;
			}
			if (i == 50) {
				count25--;
				count50++;
			}
			if (i == 100) {
				if(count50 > 0 && count25 > 0) {
					count50--;
					count25--;
				}else {
					count25 = count25 - 3;
				}
			}
			
			if (count25 < 0 || count50 < 0) {
				return "NO";
			}
		}
		return "YES";
	}

}
