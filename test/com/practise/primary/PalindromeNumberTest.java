package com.practise.primary;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class PalindromeNumberTest {
	
	private PalindromeNumber palindromeNumber;

	@Before
	public void setUp() throws Exception {
		palindromeNumber = new PalindromeNumber();
	}
	
	@Parameterized.Parameter(value = 0)
	public int x;
	
	@Parameterized.Parameter(value = 1)
	public boolean result;

	@Test
	public void testIsPalindrome() {
		assertEquals(palindromeNumber.isPalindrome(x), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{121, true}, 
				{-121, false}, 
				{10, false}
		});
	}

}
