package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ContainsDuplicateTest {
	
	private ContainsDuplicate containsDuplicate;

	@BeforeEach
	void setUp() throws Exception {
		containsDuplicate = new ContainsDuplicate();
	}

	@ParameterizedTest
	@MethodSource
	void testContainsDuplicate(int[] nums, boolean result) {
		assertEquals(containsDuplicate.execute(nums), result);
	}
	
	static List<Arguments> testContainsDuplicate() {
		return List.of(
				Arguments.of(new int[] {1,2,3,1}, true), 
				Arguments.of(new int[] {1,2,3,4}, false), 
				Arguments.of(new int[] {1,1,1,3,3,4,3,2,4,2}, true));
	}

}
