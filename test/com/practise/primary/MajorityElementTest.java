package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MajorityElementTest {
	
	private MajorityElement majorityElement;

	@BeforeEach
	void setUp() throws Exception {
		majorityElement = new MajorityElement();
	}

	@ParameterizedTest
	@MethodSource
	void testFindMajorityElement(int[] nums, int result) {
		assertEquals(majorityElement.find(nums), result);
	}
	
	static List<Arguments> testFindMajorityElement() {
		return List.of(
				Arguments.of(new int[] {3,2,3}, 3), 
				Arguments.of(new int[] {2,2,1,1,1,2,2}, 2));
	}

}
