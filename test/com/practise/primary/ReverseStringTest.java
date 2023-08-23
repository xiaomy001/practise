package com.practise.primary;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ReverseStringTest {
	
	private ReverseString reverseString;

	@Before
	public void setUp() throws Exception {
		reverseString = new ReverseString();
	}
	
	@Parameterized.Parameter(value = 0)
	public char[] s;
	
	@Parameterized.Parameter(value = 1)
	public char[] result;

	@Test
	public void testReverseString() {
		reverseString.execute(s);
		assertArrayEquals(s, result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
				{new char[] {'h','e','l','l','o'}, new char[] {'o','l','l','e','h'}}, 
				{new char[] {'H','a','n','n','a','h'}, new char[] {'h','a','n','n','a','H'}}
		});
	}

}
