package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MultiplesOf3Or5;

public class MultiplesOf3Or5Test {

	@Test
	public void TestSolutionFunctionReturnsCorrectSumFor15() {
		int input = 15;
		int result = new MultiplesOf3Or5().Solution(input);
		assertEquals("Expected 45", 45, result);
	}
	
	@Test
	public void TestSolutionFunctionReturnsCorrectSumFor20AndNoDecimals() {
		int input = 10;
		int result = new MultiplesOf3Or5().Solution(input);
		assertEquals("Expected 18", 18, result);
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
}
