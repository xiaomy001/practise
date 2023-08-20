package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SingleNumberTest {
	
	private SingleNumber singleNumber;

	@BeforeEach
	void setUp() throws Exception {
		singleNumber = new SingleNumber();
	}

	@ParameterizedTest
	@MethodSource
	void testSingleNumber(int[] nums, int result) {
		assertEquals(singleNumber.find(nums), result);
	}
	
	static List<Arguments> testSingleNumber() {
		return List.of(
				Arguments.of(new int[] {2,2,1}, 1), 
				Arguments.of(new int[] {4,1,2,1,2}, 4), 
				Arguments.of(new int[] {1}, 1));
	}

}
