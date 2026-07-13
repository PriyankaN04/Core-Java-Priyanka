package com.java.core.twoclass;

public class UsernameGenerator {

	public String GetUsername(String Fname, String Lname, int YOB){
		
		int Year = YOB % 100;
		
		String Username = Fname + Lname + Year;
		
	
		return Username;
		
		
		
	}
	
	
}
