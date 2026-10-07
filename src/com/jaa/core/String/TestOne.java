package com.jaa.core.String;

import com.java.core.conditionalstatement.ifcondition;

public class TestOne {

	public static void main(String[] args) {
		
		String s = "WEDNESDAY";
		//to print line by line from start
		for(int i = 0 ; i <= s.length()-1 ; i++) {

             System.out.println(s.charAt(i));
			
		}
		
		System.out.println("================================");
		//to print line by line from end
		
		for(int i= s.length()-1; i >=0 ; i--) {
             System.out.println(s.charAt(i));

			
		}
		
	}
}
