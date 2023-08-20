package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ReverseStringTest {
	
	private ReverseString reverseString;

	@BeforeEach
	void setUp() throws Exception {
		reverseString = new ReverseString();
	}

	@ParameterizedTest
	@MethodSource
	void testReverseString(char[] s, char[] result) {
		reverseString.execute(s);
		assertEquals(s, result);
	}
	
	static List<Arguments> testReverseString() {
		return List.of(
				Arguments.of(new char[] {'h','e','l','l','o'}, new char[] {'o','l','l','e','h'}), 
				Arguments.of(new char[] {'H','a','n','n','a','h'}, new char[] {'h','a','n','n','a','H'}));
	}

}
