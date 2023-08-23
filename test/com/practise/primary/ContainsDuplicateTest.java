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
public class ContainsDuplicateTest {
	
	private ContainsDuplicate containsDuplicate;

	@Before
	public void setUp() throws Exception {
		containsDuplicate = new ContainsDuplicate();
	}
	
	@Parameterized.Parameter(value = 0)
	public int[] nums;
	
	@Parameterized.Parameter(value = 1)
	public boolean result;

	@Test
	public void testContainsDuplicate() {
		assertEquals(containsDuplicate.execute(nums), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{new int[] {1,2,3,1}, true}, 
				{new int[] {1,2,3,4}, false},
				{new int[] {1,1,1,3,3,4,3,2,4,2}, true}
		});
	}

}
