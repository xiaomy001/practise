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
public class AddBinaryTest {
	
	private AddBinary addBinary;

	@Before
	public void setUp() throws Exception {
		addBinary = new AddBinary();
	}
	
	@Parameterized.Parameter(value = 0)
	public String a;
	
	@Parameterized.Parameter(value = 1)
	public String b;
	
	@Parameterized.Parameter(value = 2)
	public String result;

	@Test
	public void testAddBinary() {
		assertEquals(addBinary.execute(a, b), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{"11", "1", "100"}, 
				{"1010", "1011", "10101"}
		});
	}

}
