package com.java.core.twoclass;

public class Test {
	
	public static void main(String[] args) {
		
		UsernameGenerator UNG = new UsernameGenerator();
		
		String Username = UNG.GetUsername("Nikhil", "Satav", 1999);		
	
		System.out.println("Username is = " +Username);
	}

}
