package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PascalTriangleTest {
	
	private PascalTriangle pascalTriangle;

	@BeforeEach
	void setUp() throws Exception {
		pascalTriangle = new PascalTriangle();
	}

	@ParameterizedTest
	@MethodSource
	void testPascalTriangle(int numRows, List<List<Integer>> result) {
		assertIterableEquals(pascalTriangle.generate(numRows), result);
	}
	
	static List<Arguments> testPascalTriangle() {
		return List.of(
				Arguments.of(5, Arrays.asList(
						Arrays.asList(1), 
						Arrays.asList(1, 1), 
						Arrays.asList(1, 2, 1), 
						Arrays.asList(1, 3, 3, 1), 
						Arrays.asList(1, 4, 6, 4, 1))), 
				Arguments.of(1, Arrays.asList(Arrays.asList(1))));
	}

}
