package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.VasyaClerkLine;

public class VasyaClerkLineTest {

	@Test
	public void TestDefaultNoWhenEmptyStringArrayIsProvided() {
		int[] input = {};
		String result = VasyaClerkLine.Tickets(input);
	    assertEquals("Response did no match","No",result);
				
	}
	
	@Test
	public void TestYesWhen25IsSent() {
		int[] input = {25};
		String result = VasyaClerkLine.Tickets(input);
	    assertEquals("Response did no match","Yes",result);
	}
	
}
