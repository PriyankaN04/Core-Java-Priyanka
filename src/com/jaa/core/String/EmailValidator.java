package com.jaa.core.String;

import java.util.Scanner;

import com.java.core.Loop.Whileloop;
import com.java.core.conditionalstatement.ifcondition;

public class EmailValidator {

	public static void main(String[] args) {
		
		System.out.println("Enter email address");
		
		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		sc.close();
		
		String originalEmail = "wednesday@gmail.com";
		
		//1st case = It will print only as it is or give as invalid email
		//using equals
		
		if(originalEmail.equals(email)) {
			System.out.println("Valid Email");
			}
		else {
			System.out.println("Invalid Email");
		}
		
		//2nd case = It will print at upper or lower case both 
		//using equals Ignore case
		
		if(originalEmail.equalsIgnoreCase(email)){
			System.out.println("Valid email");
		}
		else {
			System.out.println("Invalid email");
		}
		
	}
}
