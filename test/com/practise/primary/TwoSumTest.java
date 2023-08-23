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
public class TwoSumTest {
	
	private TwoSum twoSum;

	@Before
	public void setUp() throws Exception {
		twoSum = new TwoSum();
	}
	
	@Parameterized.Parameter(value = 0)
	public int[] nums;
	
	@Parameterized.Parameter(value = 1)
	public int target;
	
	@Parameterized.Parameter(value = 2)
	public int[] result;

	@Test
	public void testTwoSum() {
		assertArrayEquals(twoSum.execute(nums, target), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}}, 
				{new int[] {3, 2, 4}, 6, new int[] {1, 2}}, 
				{new int[] {3, 3}, 6, new int[] {0, 1}}
		});
	}

}
