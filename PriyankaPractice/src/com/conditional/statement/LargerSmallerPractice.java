package com.conditional.statement;

import java.util.Scanner;

public class LargerSmallerPractice {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		int a = SC.nextInt();
		int b = SC.nextInt();
		
		int Larger = (a>b)? a:b;
		int Smaller = (a<b)? a:b;
		
		if(Larger % 2 == 0) {
			System.out.println(Larger);
			
		}
		
		else {
			
			System.out.println(Smaller);
		}
	
		
	}
}
