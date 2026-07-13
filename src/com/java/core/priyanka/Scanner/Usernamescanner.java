package com.java.core.priyanka.Scanner;

import java.util.Scanner;

public class Usernamescanner {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter yout first name :");
		
		String Fname = SC.next();
		
		System.out.println("Enter your last name : ");
		
		String Lname = SC.next();
		
	    System.out.println("Enter your YOB :");
	
	   
	    int Year = SC.nextInt();
	
	
		String Fullname = Fname + Lname + Year;
		
		System.out.println("Full name is = " +Fullname);
		
		
		
		
		
		
		
		
	}
	
}
