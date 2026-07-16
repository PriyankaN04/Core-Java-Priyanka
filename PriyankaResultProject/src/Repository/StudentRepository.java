package Repository;

import Entity.Student;

public class StudentRepository {

	public Student GetPriyankadetails() {
		
	Student S = new Student();
	S.ID = 101;
	S.Firstname = "Priyanka";
	S.Lastname = "Satav";
	S.Age = 28;
	S.Mathsmarks = 85;
	S.Sciencemarks = 90;
	S.Englishmarks = 88;
	return S;
	}
	
	public Student GetNikhildetails() {
		
	Student S1 = new Student();	
		S1.ID = 102;
		S1.Firstname = "Nikhil";
		S1.Lastname = "Satav";
		S1.Age = 29;
		S1.Mathsmarks = 80;
		S1.Sciencemarks = 78;
		S1.Englishmarks = 90;
		return S1;	
	}
	
	public Student GetSoftydetails() {
		
	Student S2 = new Student();	
		S2.ID = 103;
		S2.Firstname = "Softy";
		S2.Lastname = "Satav";
		S2.Age = 1;
		S2.Mathsmarks = 99;
		S2.Sciencemarks = 98;
		S2.Englishmarks = 95;
		return S2;	
	}
	
	public Student GetPihudetails() {
		
	Student S3 = new Student();
	 S3.ID = 104;
	 S3.Firstname = "Pihu";
	 S3.Lastname = "Rathod";
	 S3.Age = 6;
	 S3.Mathsmarks = 90;
	 S3.Sciencemarks = 80;
	 S3.Englishmarks = 70;
	return S3;	
	}
	
	public Student GetAnudetails() {
		
		Student S4 = new Student();
		S4.ID = 105;
		S4.Firstname = "Anu";
		S4.Lastname = "Rathod";
		S4.Age = 55;
		S4.Mathsmarks = 70;
		S4.Sciencemarks = 70;
		S4.Englishmarks = 75;
		return S4;
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	