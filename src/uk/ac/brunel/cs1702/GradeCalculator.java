// CS1702 Assignment 1
// Developed by Diogo Costa
// Grade Calculator

package uk.ac.brunel.cs1702;
//import java.util.Scanner;

public class GradeCalculator {

	//Declare all required Fields here as explained in the worksheet A1. 
	
	static final double W1 = 0.10, W2 = 0.10, W3 = 0.15, W4 = 0.15, W5 = 0.25, W6 = 0.25;
	static double a1, a2, a3, a4, a5, a6;
	static String v1 = "A", v2 = "A";
	
	public static void main(String[] args) {		
		double totalMarks = a1 * W1 + a2 * W2 + a3 * W3 + a4 * W4 + a5 * W5 + a6 * W6;
		
		String finalVivaGrade = CalculateViva(v1, v2);
		String finalGrade = CalculateGrade(totalMarks, finalVivaGrade);
		
		System.out.println("Total marks: " + totalMarks);
		System.out.println("Viva grade: " + finalVivaGrade);
		System.out.println("Final grade: " + finalGrade);
		
	}	
	public static String CalculateViva(String v1, String v2) {		
		if (v1.equals(v2)) {
			return v1;
		} else if (v1.compareTo(v2) < 0) {
			return v1;
		} else if (v1.compareTo(v2) > 0) {
			return v2;
		} else {
			return "F";
		}
	}
	
	public static String CalculateGrade(double totalMarks, String finalVivaGrade) {
		
		int fortyPercentMarks = 40;
		String finalGrade;
		
		if (totalMarks >= 70 && a5 >= fortyPercentMarks && a6 >= fortyPercentMarks && finalVivaGrade == "A") {
			// A
			finalGrade = "A";
		} else if (totalMarks >= 60 && a5 >= fortyPercentMarks && a6 >= fortyPercentMarks && (finalVivaGrade == "B" || finalVivaGrade == "A")) {
			// B
			finalGrade = "B";
		} else if (totalMarks >= 50 && (finalVivaGrade == "C" || finalVivaGrade == "B" || finalVivaGrade == "A")) {
			// C
			finalGrade = "C";
		} else if (totalMarks >= 40 && (finalVivaGrade == "D" || finalVivaGrade == "C" || finalVivaGrade == "B" || finalVivaGrade == "A")) {
			// D
			finalGrade = "D";
		} else {
			// F
			finalGrade = "F";
		}
		
		return finalGrade;
	}
}