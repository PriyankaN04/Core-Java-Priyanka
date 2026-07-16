package Main;

import Entity.Student;
import Repository.StudentRepository;

public class Test {
	
	public static void main(String[] args) {
		
		StudentRepository Repository = new StudentRepository();		
		System.out.println("Print details of Priyanka:");
		
		Student Priyanka = Repository.GetPriyankadetails();
		System.out.println(Priyanka.ID);
		System.out.println(Priyanka.Firstname);
		System.out.println(Priyanka.Lastname);
		System.out.println(Priyanka.Age);
		System.out.println(Priyanka.Mathsmarks);
		System.out.println(Priyanka.Sciencemarks);
		System.out.println(Priyanka.Englishmarks);
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Print details of Nikhil:");
		
		Student Nikhil = Repository.GetNikhildetails();
		System.out.println(Nikhil.ID);
		System.out.println(Nikhil.Firstname);
		System.out.println(Nikhil.Lastname);
		System.out.println(Nikhil.Age);
		System.out.println(Nikhil.Mathsmarks);
		System.out.println(Nikhil.Sciencemarks);
		System.out.println(Nikhil.Englishmarks);
		
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Print details of Softy:");
		
		Student Softy = Repository.GetSoftydetails();
		System.out.println(Softy.ID);
		System.out.println(Softy.Firstname);
		System.out.println(Softy.Lastname);
		System.out.println(Softy.Age);
		System.out.println(Softy.Mathsmarks);
		System.out.println(Softy.Sciencemarks);
		System.out.println(Softy.Englishmarks);
		
		
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Print details of Pihu:");
		
		Student Pihu = Repository.GetPihudetails();
		System.out.println(Pihu.ID);
		System.out.println(Pihu.Firstname);
		System.out.println(Pihu.Lastname);
		System.out.println(Pihu.Age);
		System.out.println(Pihu.Mathsmarks);
		System.out.println(Pihu.Sciencemarks);
		System.out.println(Pihu.Englishmarks);
		
		
        System.out.println("------------------------------------------------------------------");
		
		System.out.println("Print details of Anu:");
		
		Student Anu = Repository.GetAnudetails();
		System.out.println(Anu.ID);
		System.out.println(Anu.Firstname);
		System.out.println(Anu.Lastname);
		System.out.println(Anu.Age);
		System.out.println(Anu.Mathsmarks);
		System.out.println(Anu.Sciencemarks);
		System.out.println(Anu.Englishmarks);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
