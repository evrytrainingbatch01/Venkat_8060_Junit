package com.evry;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class ArrayMainTest {
	public ArrayMain main;
	@Before
	public void setUp() {
		main = new ArrayMain();
	}

	@Test
	public void testSmallestNumber() {
		 int[] integers = new int[] { 10, 8, 4, 5, 9 };
		 int actual = main.smallestNumber(integers);
		 int expected = 4;
		    assertEquals(expected, actual);
	}

}
