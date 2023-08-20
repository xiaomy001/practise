package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GuessNumberHigherORLowerTest {

	@ParameterizedTest
	@MethodSource
	void testGuessNumber(int n, int result) {
		GuessNumberHigherORLower guessNumberHigherORLower = new GuessNumberHigherORLower(result);
		assertEquals(guessNumberHigherORLower.guessNumber(n), result);
	}
	
	static List<Arguments> testGuessNumber() {
		return List.of(
				Arguments.of(10, 6), 
				Arguments.of(1, 1), 
				Arguments.of(2, 1));
	}

}
