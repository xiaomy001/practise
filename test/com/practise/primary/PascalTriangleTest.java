package com.practise.primary;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class PascalTriangleTest {
	
	private PascalTriangle pascalTriangle;

	@Before
	public void setUp() throws Exception {
		pascalTriangle = new PascalTriangle();
	}
	
	@Parameterized.Parameter(value = 0)
	public int numRows;
	
	@Parameterized.Parameter(value = 1)
	public List<List<Integer>> result;

	@SuppressWarnings("deprecation")
	@Test
	public void testPascalTriangle() {
		assertThat(pascalTriangle.generate(numRows), is(result));
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{5, Arrays.asList(
						Arrays.asList(1), 
						Arrays.asList(1, 1), 
						Arrays.asList(1, 2, 1), 
						Arrays.asList(1, 3, 3, 1), 
						Arrays.asList(1, 4, 6, 4, 1))}, 
				{1, Arrays.asList(Arrays.asList(1))}
		});
	}

}
