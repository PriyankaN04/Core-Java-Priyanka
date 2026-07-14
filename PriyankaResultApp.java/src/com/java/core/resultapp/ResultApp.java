package com.java.core.resultapp;

public class ResultApp {

	public static void main(String[] args) {
		
		NikhilMarksheet NM = new NikhilMarksheet();
		
	int	Marksobtained = NM.maths + NM.english + NM.science + NM.history;
		
		System.out.println("Marks obtained of nikhil are = " +Marksobtained);
		
	int TotalMarks = NM.Totalmaths + NM.Totalenglish + NM.Totalscience + NM.Totalhistory;
	
	    System.out.println("Total Marks are = " +TotalMarks);
		
		
		double NikhilPercentage = (Marksobtained*100)/TotalMarks;
		
		System.out.println("Percentage of nikhil are = " +NikhilPercentage);
		
		System.out.println("-------------------------------------------------------------------");
		
		PriyankaMarksheet PM = new PriyankaMarksheet();
		
		int Obtainedmarks = PM.english + PM.maths + PM.geography + PM.computerscience;
		
		System.out.println("Marks obtained of priyanka are = " +Obtainedmarks);
		
		int MarksTotal = PM.Totalenglish + PM.Totalmaths + PM.Totalgeography + PM.Totalcomputerscience;
		
		System.out.println("Total marks are = " +MarksTotal);
		
		double PriyankaPercentage = (Obtainedmarks*100)/MarksTotal;
		
		System.out.println("Percentage of Priyanka are = " +PriyankaPercentage);
		
		System.out.println("--------------------------------------------------------------------");
		
		SoftyMarksheet SM = new SoftyMarksheet();
		
		int ObtainedMarksS = SM.drawing + SM.sketching + SM.baalbharti;
		
		System.out.println("Marks obtained of Softy are = " +ObtainedMarksS);
		
		int TotalMarksS = SM.Totaldrawing + SM.Totalsketching + SM.Totalbaalbharti;
		
		System.out.println("Total Marks are = " +TotalMarksS);
		
		double SoftyPercentage = (ObtainedMarksS*100)/TotalMarksS;
		
		System.out.println("Percentage of softy are = " +SoftyPercentage);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
