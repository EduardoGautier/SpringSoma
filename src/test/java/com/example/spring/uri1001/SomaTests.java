package com.example.spring.uri1001;



import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 
 * @author Eduardo Jose Gautier
 * 
 * */

import org.junit.jupiter.api.Test;

import com.example.spring.uri1001.model.Soma;



/**
 * 
 * @author  Eduardo Jose Gautier
 * 
 */

public class SomaTests {
	@Test
	public void testSomeLibraryMethod() {
		Soma s1 = new Soma(5,9);
		double expected = 14.0;
		double actual = s1.getR();
		assertEquals(expected, actual, 0.01);
	}
}
