package com.demo.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Addition_Test {

	@Test
	public void test() {
		Addition obj = new Addition();
		
		int expectation = obj.add(10, 20);
		int reality = 30;
		
		assertEquals(expectation, reality);
	}

}



