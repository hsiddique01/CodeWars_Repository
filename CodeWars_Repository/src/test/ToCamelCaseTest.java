package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.ToCamelCase;

public class ToCamelCaseTest {

	@Test
	public void TestFunctionReturnsInputIfNoSeperatorsArePresent() {
		String input = "test";
		String result = ToCamelCase.toCamelCase(input);
		assertEquals("Result did not match input","test",result);
	}
	
	@Test
	public void TestDashSeperaterIsRemovedAndFirstLetterInSeondWordIsCapitalised() {
		String input = "second-test";
		String result = ToCamelCase.toCamelCase(input);
		assertEquals("Result did not match input","secondTest",result);
	}
	
	@Test
	public void TestUnderscoreSeperaterIsRemovedAndFirstLetterInSeondWordIsCapitalised() {
		String input = "third_Test";
		String result = ToCamelCase.toCamelCase(input);
		assertEquals("Result did not match input","thirdTest",result); 
	}
	
	@Test
	public void TestFirstWordRemainsTheSameCaseWise() {
		String input1 = "FoUr_test";
		String input2 = "FiFtH-test";
		String result1 = ToCamelCase.toCamelCase(input1);
		String result2 = ToCamelCase.toCamelCase(input2);
		assertEquals("Result did not match input for underscore", "FoUrTest",result1);
		assertEquals("Results did not match input for dash", "FiFtHTest",result2);
	}
	
	@Test
    public void TestCodewarsAssertionOne() {
      String input = "the_Stealth_Warrior";    
      assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void TestCodewarsAssertionTwo() {
      String input = "the-Stealth-Warrior";     
      assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
	
}
