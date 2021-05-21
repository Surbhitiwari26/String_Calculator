package co.incubyte;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class StringCalculatorTest {
	
	private StringCalculator stringcalculator;
	
	@Before
	public void setup(){
		stringcalculator = new StringCalculator();
	}
	
	@Test
	public void return_Zero_For_Empty_String() {
		Assert.assertEquals(0, stringcalculator.Add(""));
	}
}
