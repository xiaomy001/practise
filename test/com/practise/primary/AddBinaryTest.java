package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AddBinaryTest {
	
	private AddBinary addBinary;

	@BeforeEach
	void setUp() throws Exception {
		addBinary = new AddBinary();
	}

	@ParameterizedTest
	@MethodSource
	void testAddBinary(String a, String b, String result) {
		assertEquals(addBinary.execute(a, b), result);
	}
	
	static List<Arguments> testAddBinary() {
		return List.of(
				Arguments.of("11", "1", "100"), 
				Arguments.of("1010", "1011", "10101"));
	}

}
