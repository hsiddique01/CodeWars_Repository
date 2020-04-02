package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MultiplesOf3Or5;

public class MultiplesOf3Or5Test {
	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
	 */
	@Test
	public void TestSolutionFunctionReturnsCorrectSumFor15() {
		int input = 15;
		//Three = 3 + 6 + 9 + 12 + 15 = 45
		//Five = 5 + 10 + 15 = 30
		//15 is counted once though present in both
		int result = new MultiplesOf3Or5().Solution(input);
		assertEquals("Expected 60", 60, result);
	}
	
	@Test
	public void TestSolutionFunctionReturnsCorrectSumFor20AndNoDecimals() {
		int input = 10;
		//Three = 3 + 6 + 9 = 18
		//Five = 5 + 10 = 15
		int result = new MultiplesOf3Or5().Solution(input);
		assertEquals("Expected 33", 33, result);
	}
	
	@Test
	public void TestSolutionFunctionReturnsZeroWhenThereAreNoDerativesOf3() {
		int input = 2;
		int result = new MultiplesOf3Or5().Solution(input);
		assertEquals("Expected 0", 0, result);
	}
	
	@Test
	public void TestSolutionFunctionReturnsCorrectSumWhenLookingForDerativesOf5And3() {
		int input = 5;
		int result = new MultiplesOf3Or5().Solution(input);
		assertEquals("Expected 8", 8, result);
	}
	
	@Test
	public void TestSolutionFunctionWithMinusValue() {
		int input = -5;
		int result = new MultiplesOf3Or5().Solution(input);
		assertEquals("Expected -8", -8, result);
	}
}
