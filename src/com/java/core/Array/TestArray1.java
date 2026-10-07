package com.java.core.Array;

public class TestArray1 {
       public static void main(String[] args) {
	
    //We can create the null array with 0 elements and then restrict the limit of array	   
    	  // int[] i = new {}; -> This will be a blank array
    	   
    	  int[] redbus = new int[2]; // we have restricted the limit of array 
    	   redbus[0] = 20;
    	   redbus[1] = 21;
    	   
    	 for(int i = 0; i<redbus.length; i++) {
    		 System.out.println(redbus[i]);
    		  }  
    	   
    	 //****int[] a = {1,2,3,4,5}; -> this is Array of integer
    	 
    	 //****Interger[] aa = {4,5,2,5,1,6}; -> this is Array of object of integer - we have used wrapper class here
}
	
}
