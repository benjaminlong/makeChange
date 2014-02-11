package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class CashTest {

	@Test
	public void makeChangeTest() {
		int[] currency = {1,5,10,20,50,100};
		Cash cash = new Cash(currency);
		int value = 0;
		int expectedValue = 0;
		
		// Test negative value
		value = -53;
		expectedValue = 0;
		assertEquals(expectedValue, cash.makeChange(value));
		
		// Test zero value
		value = 0;
		expectedValue = 0;
		assertEquals(expectedValue, cash.makeChange(value));
		
		// Test Bill values
		expectedValue = 1;
		
		value = 1;
		assertEquals(expectedValue, cash.makeChange(value));
		
		value = 5;
		assertEquals(expectedValue, cash.makeChange(value));
		
		value = 10;
		assertEquals(expectedValue, cash.makeChange(value));
		
		value = 20;
		assertEquals(expectedValue, cash.makeChange(value));
		
		value = 50;
		assertEquals(expectedValue, cash.makeChange(value));
		
		value = 100;
		assertEquals(expectedValue, cash.makeChange(value));
		
		// Test Normal values
		expectedValue = 2;
		value = 105;
		assertEquals(expectedValue, cash.makeChange(value));
		
		expectedValue = 4;
		value = 135;
		assertEquals(expectedValue, cash.makeChange(value));
		
		expectedValue = 6;
		value = 186;
		assertEquals(expectedValue, cash.makeChange(value));
		
		expectedValue = 9;
		value = 486;
		assertEquals(expectedValue, cash.makeChange(value));
		
		expectedValue = 200;
		value = 20000;
		assertEquals(expectedValue, cash.makeChange(value));
		
		expectedValue = 401;
		value = 40001;
		assertEquals(expectedValue, cash.makeChange(value));
	}

}
