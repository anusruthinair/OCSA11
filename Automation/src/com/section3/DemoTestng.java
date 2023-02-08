package com.section3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoTestng {
	@Test
	public void check()
	{
		String actual="History";
		String expected="story";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(actual.contains(expected));
		System.out.println("pass");
		sa.assertAll();
		
	}
	
}

//pass
//PASSED: check













