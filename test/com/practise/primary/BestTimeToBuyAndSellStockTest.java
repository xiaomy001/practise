package com.practise.primary;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class BestTimeToBuyAndSellStockTest {
	
	private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

	@Before
	public void setUp() throws Exception {
		bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
	}
	
	@Parameterized.Parameter(value = 0)
	public int[] prices;
	
	@Parameterized.Parameter(value = 1)
	public int result;

	@Test
	public void testCalculateMaxProfit() {
		assertEquals(bestTimeToBuyAndSellStock.calculateMaxProfit(prices), result);
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{new int[] {7,1,5,3,6,4}, 5}, 
				{new int[] {7,6,4,3,1}, 0}
		});
	}

}
