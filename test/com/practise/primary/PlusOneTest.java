package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PlusOneTest {
	
	private PlusOne plusOne;

	@BeforeEach
	void setUp() throws Exception {
		plusOne = new PlusOne();
	}

	@ParameterizedTest
	@MethodSource
	void testPlusOne(int[] digits, int[] result) {
		assertArrayEquals(plusOne.execute(digits), result);
	}
	
	static List<Arguments> testPlusOne() {
		return List.of(
				Arguments.of(new int[] {1,2,3}, new int[] {1,2,4}), 
				Arguments.of(new int[] {4,3,2,1}, new int[] {4,3,2,2}), 
				Arguments.of(new int[] {9}, new int[] {1,0}));
	}

}
