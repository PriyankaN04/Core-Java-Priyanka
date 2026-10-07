package com.java.core.Array;

import com.java.core.Loop.ForLoop;
import com.java.core.conditionalstatement.ifcondition;

public class TestStringArray {
       public static void main(String[] args) {
	
    	  String[] days = { "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun" };
    	  
    	   //when we have to print the single day using index number
    	   System.out.println(days[4]);
    	   
    	  //When we have to print the days start with T 
    	  // using for loop 
    	    
    	   for(int i = 0; i<days.length; i++       ){
    		   if(days[i].startsWith("T")) {
    		   System.out.println(days[i]);
    		   }
    	   }
    	   
    	   
    	   
    	   
    	   
    	   
    	   
}
}
