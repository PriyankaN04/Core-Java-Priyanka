package com.java.core.paramconstructor;

public class Student {

	//variable declare kela - it is a global variable - we can use this for any method
	public String name;
	
	public int age;
	
	// parameterized constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	//Method
	public void Printdetails() {
		System.out.println("Name is = " +name);
		System.out.println("Age is = " +age);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
