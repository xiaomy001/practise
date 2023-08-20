package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestCommonPrefixTest {
	
	private LongestCommonPrefix longestCommonPrefix;

	@BeforeEach
	void setUp() throws Exception {
		longestCommonPrefix = new LongestCommonPrefix();
	}

	@ParameterizedTest
	@MethodSource
	void testFind(String[] strs, String result) {
		assertEquals(longestCommonPrefix.find(strs), result);
	}
	
	static List<Arguments> testFind() {
		return List.of(
				Arguments.of(new String[] {"flower","flow","flight"}, "fl"), 
				Arguments.of(new String[] {"dog","racecar","car"}, ""));
	}

}
