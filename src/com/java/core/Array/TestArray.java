package com.java.core.Array;

import java.util.Iterator;

import com.java.core.conditionalstatement.ifcondition;

public class TestArray {

	public static void main(String[] args) {
		
		int[] heights = {10,20,30,40,50};
	
	//1st way to print = when we know the index number exactly and the array in element will not change	
		System.out.println(heights[0]);
		System.out.println(heights[1]);
		System.out.println(heights[2]);
		System.out.println(heights[3]);
		System.out.println(heights[4]);
		
	//2nd way to print = using for loop when the index number of element will not be exactly at same location and may change
	//when we use .length we can cover the length of elements in array	
	for(int i =0; i<heights.length; i++) {
		System.out.println(heights[i]);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
