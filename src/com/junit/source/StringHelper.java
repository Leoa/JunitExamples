package com.junit.source;



public class StringHelper {
	
	//test method in isolating passing inputs to it. 
	
	// remove all A chars in first 2 positions of string
	
	public String truncateAInFirst2Positions(String str){
		if (str.length()<=2){
			return  str.replaceAll("A", "");
			
		}
		String first2Chars = str.substring(0,2);
		String stringMinusFirst2Chars = str.substring(2);
		return first2Chars.replaceAll("A","")+ stringMinusFirst2Chars;
		
	}
	
	// first two chars are the same
	
	public boolean areFirstAndLastTwoCharsTheSame(String str){
		
		if(str.length()<=2){return false;}
		if(str.length()==2){return true;}
		
		String first2Chars = str.substring(0,2);
		String last2Chars = str.substring(str.length( )-2);
		return first2Chars.equals(last2Chars);
		
	}

}

