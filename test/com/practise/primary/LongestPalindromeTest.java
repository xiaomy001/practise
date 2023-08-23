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
public class LongestPalindromeTest {
	
	private LongestPalindrome longestPalindrome;

	@Before
	public void setUp() throws Exception {
		longestPalindrome = new LongestPalindrome();
	}
	
	@Parameterized.Parameter(value = 0)
	public String s;
	
	@Parameterized.Parameter(value = 1)
	public int result;

	@Test
	public void testFindLongestPalindrome() {
		assertEquals(longestPalindrome.find(s), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{"abccccdd", 7}, 
				{"a", 1}
		});
	}

}
