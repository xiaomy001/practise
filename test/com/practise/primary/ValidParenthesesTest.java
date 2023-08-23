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
public class ValidParenthesesTest {
	
	private ValidParentheses validParentheses;

	@Before
	public void setUp() throws Exception {
		validParentheses = new ValidParentheses();
	}
	
	@Parameterized.Parameter(value = 0)
	public String s;
	
	@Parameterized.Parameter(value = 1)
	public boolean result;

	@Test
	public void testValidParentheses() {
		assertEquals(validParentheses.execute(s), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{"()", true},
				{"()[]{}", true},
				{"(]", false}
		});
	}

}
