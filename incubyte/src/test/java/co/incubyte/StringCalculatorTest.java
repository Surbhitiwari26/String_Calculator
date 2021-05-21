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
	
	@Test
	public void return_Addition_For_String_Contains_One_Number(){
		Assert.assertEquals(10, stringcalculator.Add("10"));
	}
	
	@Test
	public void return_Addition_For_String_Contains_Two_Numbers(){
		Assert.assertEquals(16, stringcalculator.Add("8,8"));
	}
	
	@Test
	public void return_Addition_For_String_Contains_Multiple_Numbers(){
		Assert.assertEquals(41, stringcalculator.Add("8,8,4,10,5,6"));
	}
	
	@Test
	public void return_Addition_For_String_Separated_By_NewLine_And_Comma(){
		Assert.assertEquals(20, stringcalculator.Add("6\n3,1\n5,5"));
	}
	
	@Test
	public void return_Addition_For_String_Contains_Different_Delimiters(){
		Assert.assertEquals(15, stringcalculator.Add("//3,\n4;1//3#@4"));
	}
	
	@Test 
	public void throw_Exception_For_String_Contains_Negative_Numbers(){
		try
		{
			stringcalculator.Add("//3,\n-4;1//-3#-2@4");
		}
		catch (IllegalArgumentException e) {
			Assert.assertEquals(e.getMessage(), "Negatives not allowed: -4,-3,-2");
		}		
	}
	
	@Test
	public void return_Addition_For_Numbers_lessthan_1001(){
		Assert.assertEquals(21, stringcalculator.Add("8,1001,10,2,1"));
	}
	
	@Test
	public void return_Addition_For_String_Contains_Lengthy_Delimiters(){
		Assert.assertEquals(15, stringcalculator.Add("//[*******]3,;;;;;\n\n4;1//3******#@4"));
	}
}
