package com.practise.primary;

public class GuessNumberHigherORLower {
	
	private int pick;
	
	public GuessNumberHigherORLower(int pick) {
		this.pick = pick;
	}
	
	private int guess(int num) {
		if (num > pick) {
			return -1;
		} else if (num < pick) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int guessNumber(int n) {
		// TODO: complete the code
	}

}
