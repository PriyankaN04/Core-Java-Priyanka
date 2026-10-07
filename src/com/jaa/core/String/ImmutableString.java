package com.jaa.core.String;

import com.java.core.conditionalstatement.ifcondition;

public class ImmutableString {

	public static void main(String[] args) {
		
	// Immutable = Once created it cannot be changed
		
		String pwd = "Friday.1234";
		
		String pwd2 = pwd.toUpperCase();
		
		System.out.println(System.identityHashCode(pwd2));
		System.out.println(System.identityHashCode(pwd));
		
		if(pwd==pwd2){
			System.out.println("Both strings are saved at same memory location");
		}
		else {
			System.out.println("Both saved at different memory location");
		}
		
		
	}
}
