package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RomanToIntegerTest {

	private RomanToInteger romanToInteger;
	
	@BeforeEach
	void setUp() throws Exception {
		romanToInteger = new RomanToInteger();
	}

	@ParameterizedTest
	@MethodSource
	void testRomanToInteger(String s, int result) {
		assertEquals(romanToInteger.execute(s), result);
	}
	
	static List<Arguments> testRomanToInteger() {
		return List.of(
				Arguments.of("III", 3), 
				Arguments.of("LVIII", 58), 
				Arguments.of("MCMXCIV", 1994));
	}

}
