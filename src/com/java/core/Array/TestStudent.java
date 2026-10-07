package com.java.core.Array;

public class TestStudent {
      public static void main(String[] args) {
		Student s = new Student();
		s.id = 12;
		s.name = "Ram";
		
		Student s1 = new Student();
		s1.id = 13;
		s1.name = "Sham";
		
		Student[] studentarray = {s, s1};
		
		for(int i = 0; i<studentarray.length ; i++) {
			Student st = studentarray[i];
			System.out.println(st.id);
			System.out.println(st.name);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
