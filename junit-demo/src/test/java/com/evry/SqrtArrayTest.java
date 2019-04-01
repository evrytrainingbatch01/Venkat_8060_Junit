package com.evry;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SqrtArrayTest {
	SqrtArray array;

	@Before
	public void setUp() {
		array = new SqrtArray();
	}

	@Test
	public void testSqrtNumbers() {
		int[] integers = new int[] { 20, 98, 12, 7, 35 };
		int[] result = array.sqrtNumbers(integers);
		assertEquals(400, result[0]);
	}

}
