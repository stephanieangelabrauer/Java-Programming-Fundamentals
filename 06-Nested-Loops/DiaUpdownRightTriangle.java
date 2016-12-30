/**
	This Java program uses nested for loops to draw the diagonal of an upside-down right triangle.

	First, it inputs the base of a right triangle, then use that to draw the diagonal with asterisks.

	@author Stephanie-Angela Brauer	

*/

import java.util.Scanner;

public class DiaUpdownRightTriangle {
   public static void main(String[] args) {

		int stop;
		int column;

		Scanner sc = new Scanner (System.in);

		System.out.print ("Please enter an integer: ");
		stop = sc.nextInt(); 

		for (int row = 1; row <= stop; row++) {
			
		    for (column = 1; column < (stop-row)+1; column++)
			System.out.print(".");
		    System.out.print("*");
		    System.out.println ();              
		}
	}
}