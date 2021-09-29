package edu.mills.cs124.assignment5;

public class Domino {
	private int left;
	private int right;
	
	public Domino (int left, int right) {
		this.left = left;
		this.right = right;
	}
	public int left() { 
		return left; 
	}
	public int right() { 
		return right;
	}
	public String toString() { 
		return "[" + left + " " + right + "]"; 
	}
	public void flip() { 
		// using the xor swap trick
		// (https://en.wikipedia.org/wiki/XOR_swap_algorithm)
		left ^= right;
		right ^= left;
		left ^= right;
	}
}
