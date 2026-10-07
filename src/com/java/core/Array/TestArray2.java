package com.java.core.Array;

public class TestArray2 {
   public static void main(String[] args) {
	
	   //We can replace the elements in array but we cannot add elements in array
	   //means length of array is fixed
	   //eg. int[] a = {2, 5,6,52,5,5,8,616,48,561,548,};
	   
	   //at index 2 -> 6
	   //a[9] = 999;
	   //System.out.println(a[2]); We have 9 elements means index will be 8 so we cannot add 9th element in array
	   
	   
	   //****We can store data in array heterogeneously but we should not store like this
	   //because it cannot maintain the modularity of data and data will be difficult to analyze
	   
	   //heterogeneous array using object
	   Object[] abc = {"Ram", false, 25, 25.23f, 'A'};
	   
	   //We can create data heterogeneously using object but it is impossible to analyze the elements in array
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
}
