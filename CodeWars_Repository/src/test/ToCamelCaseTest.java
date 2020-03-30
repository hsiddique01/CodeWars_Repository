package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.ToCamelCase;

public class ToCamelCaseTest {

	@Test
	public void test() {
		String input = "test";
		String result = ToCamelCase.toCamelCase(input);
		assertEquals("Result did not match input","test",result);
	}
}
