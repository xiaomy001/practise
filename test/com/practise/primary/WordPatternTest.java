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
public class WordPatternTest {
	
	private WordPattern wordPattern;

	@Before
	public void setUp() throws Exception {
		wordPattern = new WordPattern();
	}
	
	@Parameterized.Parameter(value = 0)
	public String pattern;
	
	@Parameterized.Parameter(value = 1)
	public String s;
	
	@Parameterized.Parameter(value = 2)
	public boolean result;

	@Test
	public void testWordPattern() {
		assertEquals(wordPattern.execute(pattern, s), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{"abba", "dog cat cat dog", true}, 
				{"abba", "dog cat cat fish", false}, 
				{"aaaa", "dog cat cat dog", false}
		});
	}

}
