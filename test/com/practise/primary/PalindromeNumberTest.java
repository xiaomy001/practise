package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PalindromeNumberTest {
	
	private PalindromeNumber palindromeNumber;

	@BeforeEach
	void setUp() throws Exception {
		palindromeNumber = new PalindromeNumber();
	}

	@ParameterizedTest
	@MethodSource
	void testIsPalindrome(int x, boolean result) {
		assertEquals(palindromeNumber.isPalindrome(x), result);
	}
	
	static List<Arguments> testIsPalindrome() {
		return List.of(
				Arguments.of(121, true), 
				Arguments.of(-121, false), 
				Arguments.of(10, false));
	}

}
