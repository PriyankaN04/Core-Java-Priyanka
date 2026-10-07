package com.java.core.SundayPractive;

import java.nio.file.spi.FileSystemProvider;

public class Test {

	
	public static void main(String[] args) {
		
		System.out.println("Two class communication");
		
		Twoclass fullname = new Twoclass();
		
	String 	Fulln = fullname.Twoclass("Nikhil", "Satav", 1997);
	
		System.out.println("Fullname is = " +Fulln);
		
			System.out.println("-----------------------------------");
			
			System.out.println("Two class variable");
			
		fullname.ID = 358501;
		
		fullname.Fname = "Nikhil";
		
		fullname.Lname = "Satav";
		
		fullname.age = 29;
		
		fullname.Marks = 90;
		
		System.out.println("ID = " +fullname.ID);
		System.out.println("First name = " +fullname.Fname);
		System.out.println("Last name = " +fullname.Lname);
	 System.out.println("Age = " +fullname.age);
		System.out.println("Marks = " +fullname.Marks);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
