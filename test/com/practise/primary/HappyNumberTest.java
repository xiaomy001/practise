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
public class HappyNumberTest {
	
	private HappyNumber happyNumber;

	@Before
	public void setUp() throws Exception {
		happyNumber = new HappyNumber();
	}
	
	@Parameterized.Parameter(value = 0)
	public int n;
	
	@Parameterized.Parameter(value = 1)
	public boolean result;

	@Test
	public void testIsHappy() {
		assertEquals(happyNumber.isHappy(n), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{19, true}, 
				{2, false}
		});
	}

}
