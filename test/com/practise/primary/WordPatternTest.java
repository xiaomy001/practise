package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WordPatternTest {
	
	private WordPattern wordPattern;

	@BeforeEach
	void setUp() throws Exception {
		wordPattern = new WordPattern();
	}

	@ParameterizedTest
	@MethodSource
	void testWordPattern(String pattern, String s, boolean result) {
		assertEquals(wordPattern.execute(pattern, s), result);
	}
	
	static List<Arguments> testWordPattern() {
		return List.of(
				Arguments.of("abba", "dog cat cat dog", true), 
				Arguments.of("abba", "dog cat cat fish", false), 
				Arguments.of("aaaa", "dog cat cat dog", false));
	}

}
