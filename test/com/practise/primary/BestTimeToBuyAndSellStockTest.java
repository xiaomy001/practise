package com.practise.primary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BestTimeToBuyAndSellStockTest {
	
	private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

	@BeforeEach
	void setUp() throws Exception {
		bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
	}

	@ParameterizedTest
	@MethodSource
	void testCalculateMaxProfit(int[] prices, int result) {
		assertEquals(bestTimeToBuyAndSellStock.calculateMaxProfit(prices), result);
	}
	
	static List<Arguments> testCalculateMaxProfit() {
		return List.of(
				Arguments.of(new int[] {7,1,5,3,6,4}, 5), 
				Arguments.of(new int[] {7,6,4,3,1}, 0));
	}

}
