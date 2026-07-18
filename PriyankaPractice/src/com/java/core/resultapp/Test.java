package com.java.core.resultapp;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		
		         Scanner sc = new Scanner(System.in);
		         System.out.println("Enter details of student: ");
		         String name = sc.next();
		         
		         StudentRepository Repository = new StudentRepository();
		         OutputHelper Helper = new OutputHelper();
		         
		         switch (name) {
				case "Nikhil" : {
					Student Nikhil = Repository.GetNikhildetails();
				Helper.Printstudentdetails(Nikhil);
				}
				default:
					System.out.println("Please enter a proper name");
				
				}
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
	}
}
