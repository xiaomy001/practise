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
public class SingleNumberTest {
	
	private SingleNumber singleNumber;

	@Before
	public void setUp() throws Exception {
		singleNumber = new SingleNumber();
	}
	
	@Parameterized.Parameter(value = 0)
	public int[] nums;
	
	@Parameterized.Parameter(value = 1)
	public int result;

	@Test
	public void testSingleNumber() {
		assertEquals(singleNumber.find(nums), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{new int[] {2,2,1}, 1}, 
				{new int[] {4,1,2,1,2}, 4}, 
				{new int[] {1}, 1}
		});
	}

}
