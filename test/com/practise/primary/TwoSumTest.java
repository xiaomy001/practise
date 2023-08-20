package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSumTest {
	
	private TwoSum twoSum;

	@BeforeEach
	void setUp() throws Exception {
		twoSum = new TwoSum();
	}

	@ParameterizedTest
	@MethodSource
	void testTwoSum(int[] nums, int target, int[] result) {
		assertArrayEquals(twoSum.execute(nums, target), result);
	}
	
	static List<Arguments> testTwoSum() {
		return List.of(
				Arguments.of(new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}), 
				Arguments.of(new int[] {3, 2, 4}, 6, new int[] {1, 2}), 
				Arguments.of(new int[] {3, 3}, 6, new int[] {0, 1}));
	}

}
