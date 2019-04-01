package com.evry;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] arr) {
		ArrayMain main = new ArrayMain();
		int[] integers = new int[] { 20, 98, 12, 7, 35 };
		System.out.println("Samllet number in array is: " + main.smallestNumber(integers));
	}

	public int smallestNumber(int[] integers) {

		return Arrays.stream(integers).min().getAsInt();

	}

}
