package com.practise.primary;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class GuessNumberHigherORLowerTest {

	@Parameterized.Parameter(value = 0)
	public int n;
	
	@Parameterized.Parameter(value = 1)
	public int result;
	
	@Test
	public void testGuessNumber() {
		GuessNumberHigherORLower guessNumberHigherORLower = new GuessNumberHigherORLower(result);
		assertEquals(guessNumberHigherORLower.guessNumber(n), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{10, 6}, 
				{1, 1},
				{2, 1}
		});
	}

}
