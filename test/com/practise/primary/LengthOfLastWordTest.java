package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LengthOfLastWordTest {
	
	private LengthOfLastWord lengthOfLastWord;

	@BeforeEach
	void setUp() throws Exception {
		lengthOfLastWord = new LengthOfLastWord();
	}

	@ParameterizedTest
	@MethodSource
	void testLengthOfLastWord(String s, int result) {
		assertEquals(lengthOfLastWord.execute(s), result);
	}
	
	static List<Arguments> testLengthOfLastWord() {
		return List.of(
				Arguments.of("Hello World", 5), 
				Arguments.of("   fly me   to   the moon  ", 4), 
				Arguments.of("luffy is still joyboy", 6));
	}

}
