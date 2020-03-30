package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TenMinWalk;

public class TenMinWalkTest {
	@Test
	public void TestLessThanOrGreaterThanTenReturnsFalse() {
		char[] direction1 = new char[] {};
		boolean result1 = TenMinWalk.isValid(direction1);
		assertFalse("Expected false", result1);
		char[] direction2 = new char[] {'n','s','w','e','n','s','w','e','n','s'};
		boolean result2 = TenMinWalk.isValid(direction2);
		assertTrue("Expected True", result2);
	}
	
	@Test
	public void TestTrueWhenDirectionSumsToZero() {
		char[] direction = new char[] {'n','s','w','e','n','s','w','e','n','s'};
		boolean result = TenMinWalk.isValid(direction);
		assertTrue("Expected True", result);
	}
	
	@Test
	public void TestFalseWhenDirectionSumsToZero() {
		char[] direction = new char[] {'n','s','w','e','n','s','w','e','n','e'};
		boolean result = TenMinWalk.isValid(direction);
		assertFalse("Expected False", result);
	}
	
	@Test
	public void TestCodeWarValidation() {
		assertEquals("Should return true", true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
	    assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
	    assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w'}));
	    assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
	}
}
