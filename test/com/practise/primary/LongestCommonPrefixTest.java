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
public class LongestCommonPrefixTest {
	
	private LongestCommonPrefix longestCommonPrefix;

	@Before
	public void setUp() throws Exception {
		longestCommonPrefix = new LongestCommonPrefix();
	}
	
	@Parameterized.Parameter(value = 0)
	public String[] strs;
	
	@Parameterized.Parameter(value = 1)
	public String result;

	@Test
	public void testFind() {
		assertEquals(longestCommonPrefix.find(strs), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{new String[] {"flower","flow","flight"}, "fl"}, 
				{new String[] {"dog","racecar","car"}, ""}
		});
	}

}
