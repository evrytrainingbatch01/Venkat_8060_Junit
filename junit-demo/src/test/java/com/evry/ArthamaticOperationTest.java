package com.evry;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.evry.ArthamaticOperation;

public class ArthamaticOperationTest {
	
	ArthamaticOperation operation;

	@Before
	public void setUp() {
		operation = new ArthamaticOperation();
	}

	@Test
	public void testMul() {
		int actual = operation.add(5, 7);
		int expected = 12;
		assertEquals(expected, actual);
	}

	@Test
	public void testMul_negitive() {
		int actual = operation.add(5, 7);
		int expected = 10;
		assertNotEquals(expected, actual);
	}

	@Test
	public void testAdd() {
		int actual = operation.mul(5, 7);
		int expected = 35;
		assertEquals(expected, actual);
	}

	@Test
	public void testAdd_negitive() {
		int actual = operation.mul(5, 7);
		int expected = 30;
		assertNotEquals(expected, actual);
	}

}
