package main;

public class MultiplesOf3Or5 {
	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
	 */
	public int Solution(int input) {
		if(input < 0) {
			return minusSum(input);
		} else {
			return positiveSum(input);
		}
	}

	private int positiveSum(int input) {
		int sum = 0;
		for (int i = 0; i <= input; i++) {
			System.out.println("for i = " + i + ", sum before the check = " + sum);
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				System.out.println(sum);
			}
		}
		return sum;
	}

	private int minusSum(int input) {
		int sum = 0;
		for (int i = 0; i <= -input; i++) {
			System.out.println("for i = " + i + ", sum before the check = " + sum);
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				System.out.println(sum);
			}
		}
		return -sum;
	}

}
