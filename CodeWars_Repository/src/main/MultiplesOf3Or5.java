package main;

public class MultiplesOf3Or5 {
	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
	 */
	public int Solution(int input) {
		int sum = 0;
		int minusCheck = 1;
		int newInput = 0;
		if(input > 0) {
			newInput = input;
		} else {
			newInput = -input;
			minusCheck = -1;
		}
		for (int i = 0; i <= newInput; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum*minusCheck;		
	}
}
