import java.util.Scanner;

public class gradeConverter {

	public static void main(String[] args) {
		//Welcome display
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		
		//Declare and Initialize variables
		Scanner sc = new Scanner(System.in);
		int numGrade = 0;
		String letterGrade = ""; 
		String choice = "y";
		
		//get input from user
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("Enter numerical grade: ");
			 numGrade = sc.nextInt();
		
		
		//Grading Scale
		if(numGrade >= 88) {
			letterGrade = "A";
		} else if (numGrade >= 80) {
			letterGrade = "B";
		} else if (numGrade >= 67) {
			letterGrade = "C";
		} else if (numGrade >= 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
	
	
		//Display the letter Grades
		String message = "\n"
				+ "Letter grade: " + letterGrade + "\n";
		System.out.println(message);
		
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		System.out.println();
		
		}

	}

}
