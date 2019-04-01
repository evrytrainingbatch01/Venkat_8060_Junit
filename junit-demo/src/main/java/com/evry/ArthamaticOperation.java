package com.evry;

public class ArthamaticOperation {

	public static void main(String[] args) {
		ArthamaticOperation arthamatic = new ArthamaticOperation();
		System.out.println("Addition" + arthamatic.add(5, 6));
		System.out.println("Multiplication" + arthamatic.mul(5, 6));
	}

	public int mul(int i, int j) {
		return i * j;
	}

	public int add(int i, int j) {
		return i + j;
	}

}
