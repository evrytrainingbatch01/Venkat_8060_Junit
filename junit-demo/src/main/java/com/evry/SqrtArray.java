package com.evry;

public class SqrtArray {

	public static void main(String[] args) {
		int[] integers = new int[] { 20, 98, 12, 7, 35 };
		SqrtArray sqrt = new SqrtArray();
		for(int num : sqrt.sqrtNumbers(integers)) {
			System.out.println(num);
		}
	}

	public int[] sqrtNumbers(int[] integers) {
		int[] result = new int[integers.length];
		int j = 0;
		for (int i : integers) {
			result[j] = i * i;
			j++;
		}
		return result;
	}

}
