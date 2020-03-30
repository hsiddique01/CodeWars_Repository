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
	public void TestDashSeperaterIsRemoved() {
		String input = "second-test";
		String result = ToCamelCase.toCamelCase(input);
		assertEquals("Result did not match input","secondTest",result);
	}
}
