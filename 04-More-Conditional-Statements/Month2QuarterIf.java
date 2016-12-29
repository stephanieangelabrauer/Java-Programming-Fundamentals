/**

	This program will prompt the user to input an integer month number,
	then outputs the quarter of the calendar year the month falls in.

	@author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class Month2QuarterIf {
	public static void main(String[] args) {
	
		int month;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Please enter a month number: ");
		month = sc.nextInt ();

		System.out.print(" The month number " + month + " falls in the ");

		if (month == 1)
			System.out.println("1st Quarter.");
		else if (month == 2)
			System.out.println("1st Quarter.");
		else if (month == 3)
			System.out.println("1st Quarter.");
		else if (month == 4)
			System.out.println("2nd Quarter.");
		else if (month == 5)
			System.out.println("2nd Quarter.");
		else if (month == 6)
			System.out.println("2nd Quarter.");
		else if (month == 7)
			System.out.println("3rd Quarter.");
		else if (month == 8)
			System.out.println("3rd Quarter.");
		else if (month == 9)
			System.out.println("3rd Quarter.");
		else if (month == 10)
			System.out.println("4th Quarter.");
		else if (month == 11)
			System.out.println("4th Quarter.");
		else if (month == 12)
			System.out.println("4th Quarter.");
		else
			System.out.println("invalid Quarter. Please run the Program again.");
   }
}