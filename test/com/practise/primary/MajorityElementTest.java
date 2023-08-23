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
public class MajorityElementTest {
	
	private MajorityElement majorityElement;

	@Before
	public void setUp() throws Exception {
		majorityElement = new MajorityElement();
	}
	
	@Parameterized.Parameter(value = 0)
	public int[] nums;
	
	@Parameterized.Parameter(value = 1)
	public int result;

	@Test
	public void testFindMajorityElement() {
		assertEquals(majorityElement.find(nums), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{new int[] {3,2,3}, 3}, 
				{new int[] {2,2,1,1,1,2,2}, 2}
		});
	}

}
