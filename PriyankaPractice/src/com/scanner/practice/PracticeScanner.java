package com.scanner.practice;

import java.util.Scanner;

public class PracticeScanner {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter value of a:");
		int a = SC.nextInt();
		
		System.out.println("Enter value of b:");
		int b = SC.nextInt();
		
		int add = a + b;
		
		System.out.println("Addition is = " +add);
		
		System.out.println("Enter First name:");
		String Fname = SC.next();
		
		System.out.println("Enter Last name:");
		String Lname = SC.next();
		
		System.out.println("Enter your birth year:");
		int Year = SC.nextInt();
		
		String Fullname = Fname+ Lname+ Year;
		
		System.out.println("Full name is = " +Fullname);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
