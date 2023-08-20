package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ValidParenthesesTest {
	
	private ValidParentheses validParentheses;

	@BeforeEach
	void setUp() throws Exception {
		validParentheses = new ValidParentheses();
	}

	@ParameterizedTest
	@MethodSource
	void testValidParentheses(String s, boolean result) {
		assertEquals(validParentheses.execute(s), result);
	}
	
	static List<Arguments> testValidParentheses() {
		return List.of(
				Arguments.of("()", true), 
				Arguments.of("()[]{}", true), 
				Arguments.of("(]", false));
	}

}
