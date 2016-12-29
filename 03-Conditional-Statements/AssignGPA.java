/**
	This program will input a double value representing a grade point average (GPA),
	then assign a appropriate message based on the following table:

	GPA													Message
	less than zero										Invalid GPA
	greater than or equal to zero but less than 3.0		Probation
	greater than or equal to 3.0 but less than 3.5		Good standing
	greater than or equal to 3.5						Dean's List

	@author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class AssignGPA {
   public static void main(String[] args) {
	
		double x;
		Scanner sc = new Scanner (System.in);
		System.out.print ("Please enter a double value representing a GPA: ");
		x = sc.nextDouble ();

		System.out.print("The double value of "+x+" belongs to: ");
		
		if (x >= 3.5)
			System.out.println("Dean's List");
		else if (x >=3.0)
			System.out.println("Good standing");
		else if (x >= 0)
			System.out.println("Probation");
		else
			System.out.println("Invalid GPA");
   }
}