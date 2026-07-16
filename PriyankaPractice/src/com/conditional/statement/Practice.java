package com.conditional.statement;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
	Scanner SC = new Scanner(System.in);
		
	int a = SC.nextInt();
	int b = SC.nextInt();
		
		int larger = (a>b) ? a:b;
		int Smaller = (a<b)? a:b;
		
		if(larger %2 ==0) {
			System.out.println(larger);
			
		}
		
		else {
			
			System.out.println(Smaller);
			
		}
		
		SC.close();
	}
	
}
