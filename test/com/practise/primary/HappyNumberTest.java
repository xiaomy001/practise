package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class HappyNumberTest {
	
	private HappyNumber happyNumber;

	@BeforeEach
	void setUp() throws Exception {
		happyNumber = new HappyNumber();
	}

	@ParameterizedTest
	@MethodSource
	void testIsHappy(int n, boolean result) {
		assertEquals(happyNumber.isHappy(n), result);
	}
	
	static List<Arguments> testIsHappy() {
		return List.of(
				Arguments.of(19, true), 
				Arguments.of(2, false));
	}

}
