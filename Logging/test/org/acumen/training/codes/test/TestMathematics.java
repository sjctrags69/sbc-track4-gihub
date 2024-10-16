package org.acumen.training.codes.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.acumen.training.codes.Mathematic2;
import org.acumen.training.codes.Mathematics;
import org.acumen.training.codes.NegativeOperandException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestMathematics {
	private Mathematics math;
	private Mathematic2 math2;
	
	@BeforeEach
	public void setup() {
		math = new Mathematics();
		math2 = new Mathematic2();
	}
	
	@AfterEach
	public void teardown() {
		math = null;
		math2 = null;
	}
	
	@RepeatedTest(5)
	public void testAddNegativeNumbers() {
		int x = 10;
		int y = 20;
		int expected = 10;
		
		assertThrows(NegativeOperandException.class, ()->{
			int res = math.add(x, y);
			assertEquals(expected, res);
		});
		
	}
	
	@Test
	public void testAddNegativeNumbers2() {
		int x = 10;
		int y = 20;
		int expected = 10;
		
		assertThrows(NegativeOperandException.class, ()->{
			int res = math2.add(x, y);
			assertEquals(expected, res);
		});
	}
	
	
	
	
	
	

}
