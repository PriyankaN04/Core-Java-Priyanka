package com.jaa.core.String;

public class TestStrings {

	public static void main(String[] args) {
		
		//using literals
		String s = "Irise";
		
		//using new keyword
		String s1 = new String("Irise");
		
		String s2 = "Irise";
		
		String s3 = new String("Irise");
		
		//using equals = Equals will compare the content or data eg. Irise
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		
		//using ==(double equals) = this will compare the object eg. s, s1, s2, s3
		//or we can say it will compare the identity hash code or memory location
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s1=s3);
		
		//Identity Hashcode
		System.out.println("s : " +System.identityHashCode(s));
		System.out.println("s1 : " +System.identityHashCode(s1));
		System.out.println("s2 : " +System.identityHashCode(s2));
		System.out.println("s3 : " +System.identityHashCode(s3));
		
		
		//SCP = String constant pool = diagram created in register in lecture 28	
		//Literals = Stored in SCP = No duplication for same string data
		//New Keyword = Stored in Heap memory = New string data is created every time 
		
		
	}
}
