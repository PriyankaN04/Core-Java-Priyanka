package com.jaa.core.String;

public class StringTest {

	public static void main(String[] args) {
		
	String Day = "WEDNESDAY";	
		
		//Length method
	//it is a method to check the length of the String(Wednesday)
		int Length = Day.length();
		System.out.println(Length);
		
		//contains method
		//it is a method to check if the String contains the given number or name or not, answer will be true or false
		boolean Contains = Day.contains("F");
		System.out.println(Contains);
		
		//charAt
		//it is a method to check if String has the mentioned which character on which number
		//It will give N as output at 3 because in java the sequence starts from 0
		char CharAt = Day.charAt(3);		
		System.out.println(CharAt);
		
		//concat
		//It is a method to concatenate the String and given words or numbers below
		String Concat = Day.concat("ABCD");
		System.out.println(Concat);
		
		//toLowerCase
		//It is used to change the String alphabets to lower case 
		String ToLowerCase = Day.toLowerCase();
		System.out.println(ToLowerCase);
		
		//toUpperCase
		//It is used to change the String alphabets to upper case
		String ToUpperCase = ToLowerCase.toUpperCase();
		System.out.println(ToUpperCase);
		
		
		
		
		
		
	}
}
