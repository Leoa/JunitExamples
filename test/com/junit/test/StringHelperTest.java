package com.junit.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.junit.source.StringHelper;//  import  the class with the method to test

public class StringHelperTest {// name the test class after class you are testing. add the word "test"
	
	@Before
	public  void before(){
		
		System.out.println("before each test");
		
	}
	@After
	public void after(){
		System.out.println("After each test");
	}
	
	@BeforeClass
	//static metohos are used to make a single copy of the method not matter how many times it is called.
	// class level method. 
	public static void beforeClass(){
		
		System.out.println("before a class ( runs once for every test class)");
		
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("After the test (runs once for every test class)");
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {// name of method to test here
		System.out.println("TruncateAInFirst2Positions");
		StringHelper helper = new StringHelper(); // bring in class where method is here
		String expectedOutput = "RTAA";// what is the expected output?
		String actualOutput = helper.truncateAInFirst2Positions("RTAA"); // here is were we put the stub/fake/ data for to test.  the resut of what happend after calculation
		assertEquals(expectedOutput, actualOutput);// compare results to expected results
		
	}
	
	@Ignore
	public void testAssertEquals(){
		System.out.println("testing assert");
		assertEquals("ABC","ABC");
		
	}
	
	@Test
	
	public void testAreFirstAndLastTwoCharsTheSame(){
		System.out.println("arefirstandlasttwocharsthesame");
		StringHelper helper = new StringHelper();
		assertTrue(true);
		//assertFalse(false);
		//  not a good pratice below
	assertFalse( helper.areFirstAndLastTwoCharsTheSame(""));// false
	assertFalse( helper.areFirstAndLastTwoCharsTheSame("A"));// false
	assertFalse( helper.areFirstAndLastTwoCharsTheSame("AB"));//true
	assertTrue( helper.areFirstAndLastTwoCharsTheSame("AAA"));// true
	assertFalse(helper.areFirstAndLastTwoCharsTheSame("AAB"));//false
		
	}
	
	// compary arrrays
	
	@Test
	public void testArraysSort(){
		System.out.println("testArraySort");
		int [] numbers ={5,67,2,7,9,4,60};
		Arrays.sort(numbers);
		int[] expectedOutput = {2,4,5,7,9,60,67};
		
		assertArrayEquals(expectedOutput, numbers);
		
	}
	
	// test exceptionls
	@Test(expected = NullPointerException.class)
	
	public void testArraysSortWithNullCondition(){
		System.out.println("testArraySort Exception");
		int []  numbers = null;
		Arrays.sort(numbers);
	}

	
	// preformacne test over time
	@Test(timeout=1000)
	public void testArraysSortPreformance(){
		for (int i= 0; i< 1000000;i++){
			
			int [] numbers = {i, i-1,i+1};
			Arrays.sort(numbers);
			
		}
	}
	@Test(expected = IllegalArguentException.class)
}
