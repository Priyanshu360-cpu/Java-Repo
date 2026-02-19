package com.ibm.testing.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ArithmeticTest {
	static Arithmetic arithmetic;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		arithmetic=new Arithmetic();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@ParameterizedTest
	@CsvSource({"2,3,5","-1,1,0","0,0,0","10,-5,5"})
	void test(int num1,int num2,int expected) {
		assertEquals(expected,arithmetic.sum(num1, num2));
		
		//fail("Not yet implemented");
	}
@ParameterizedTest
@ValueSource(ints= {1,3,4,-3,15,Integer.MAX_VALUE})
void testIdOdd(int number) {
	assertTrue(number % 2!=0);
  }

@ParameterizedTest
@ValueSource(strings= {"rotor","radar","racecar","leve;"})
void testLength(String text) {
	assertTrue(text.length()==5);
  }

}
