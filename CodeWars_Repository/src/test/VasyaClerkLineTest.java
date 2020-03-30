package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.VasyaClerkLine;

public class VasyaClerkLineTest {

	@Test
	public void TestDefaultNoWhenEmptyStringArrayIsProvided() {
		String[] input = {};
		String result = new VasyaClerkLine().Tickets(input);
	    assertEquals("Response did no match","No",result);
				
	}
}
