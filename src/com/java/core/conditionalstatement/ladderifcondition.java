package com.java.core.conditionalstatement;

import java.util.Scanner;

public class ladderifcondition {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 to 5");
		
		int a = sc.nextInt();
		
		
		if(a == 1) {
			System.out.println("one");
		}
		else if(a == 2) {
			System.out.println("Two");
		}
		else if(a == 3) {
            System.out.println("Three");		
		}
		else if (a == 4) {
            System.out.println("Four");		
		}
		else if(a == 5) {
			System.out.println("Five");
		}
		else {
			System.out.println("Enter a proper number");
			
		}
		
		
		
	}

}
