package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestPalindromeTest {
	
	private LongestPalindrome longestPalindrome;

	@BeforeEach
	void setUp() throws Exception {
		longestPalindrome = new LongestPalindrome();
	}

	@ParameterizedTest
	@MethodSource
	void testFindLongestPalindrome(String s, int result) {
		assertEquals(longestPalindrome.find(s), result);
	}
	
	static List<Arguments> testFindLongestPalindrome() {
		return List.of(
				Arguments.of("abccccdd", 7), 
				Arguments.of("a", 1));
	}

}
