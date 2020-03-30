package main;

public class VasyaClerkLine {

	public static String Tickets(int[] input) {
		int count25 = 0;
		for(int i: input) {
			if(i == 25) {
				count25 ++;
			}
		}
		if(count25 > 0) {
			return "Yes";
		}
		return "No";
	}

}
