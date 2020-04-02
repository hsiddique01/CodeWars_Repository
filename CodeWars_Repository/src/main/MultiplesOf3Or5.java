package main;

public class MultiplesOf3Or5 {

	public int Solution(int input) {
		int sum = 0;
		for (int i = 0; i <= input; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
