package com.ibm.testing.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArithmeticTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSum() {
		int expectedResult=6;
		Arithmetic arithmetic = new Arithmetic();
		int actualResult=arithmetic.sum(2, 4);
		
		assertEquals("Comparing Results",expectedResult,actualResult);
				
				//fail("Not yet implemented");
	}

}
