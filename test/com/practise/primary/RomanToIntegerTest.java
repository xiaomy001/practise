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
public class RomanToIntegerTest {

	private RomanToInteger romanToInteger;
	
	@Before
	public void setUp() throws Exception {
		romanToInteger = new RomanToInteger();
	}
	
	@Parameterized.Parameter(value = 0)
	public String s;
	
	@Parameterized.Parameter(value = 1)
	public int result;

	@Test
	public void testRomanToInteger() {
		assertEquals(romanToInteger.execute(s), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{"III", 3}, 
				{"LVIII", 58}, 
				{"MCMXCIV", 1994}
		});
	}

}
