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
public class PlusOneTest {
	
	private PlusOne plusOne;

	@Before
	public void setUp() throws Exception {
		plusOne = new PlusOne();
	}
	
	@Parameterized.Parameter(value = 0)
	public int[] digits;
	
	@Parameterized.Parameter(value = 1)
	public int[] result;

	@Test
	public void testPlusOne() {
		assertArrayEquals(plusOne.execute(digits), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{new int[] {1,2,3}, new int[] {1,2,4}}, 
				{new int[] {4,3,2,1}, new int[] {4,3,2,2}}, 
				{new int[] {9}, new int[] {1,0}}
		});
	}

}
