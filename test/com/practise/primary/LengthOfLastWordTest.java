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
public class LengthOfLastWordTest {
	
	private LengthOfLastWord lengthOfLastWord;

	@Before
	public void setUp() throws Exception {
		lengthOfLastWord = new LengthOfLastWord();
	}
	
	@Parameterized.Parameter(value = 0)
	public String s;
	
	@Parameterized.Parameter(value = 1)
	public int result;

	@Test
	public void testLengthOfLastWord() {
		assertEquals(lengthOfLastWord.execute(s), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{"Hello World", 5}, 
				{"   fly me   to   the moon  ", 4}, 
				{"luffy is still joyboy", 6}
		});
	}

}
