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
	
	@Test 
	public void TestNoWhen50IsSent() {
		int[] input = {50};
		String result = VasyaClerkLine.Tickets(input);
	    assertEquals("Response did no match","No",result);
	}
	
	@Test
	public void TestNoWhen100IsSent() {
		int[] input = {100};
		String result = VasyaClerkLine.Tickets(input);
	    assertEquals("Response did no match","No",result);
	}
	
	@Test
	public void TestYesWhen252550IsSent() {
		int[] input = {25,25,50};
		String result = VasyaClerkLine.Tickets(input);
	    assertEquals("Response did no match","Yes",result);
	}
	
}
