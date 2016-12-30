/**

	This Java program uses nested for loops to draw the right half of a diamond shape.

	First, it inputs the base of a right half of a diamond shape, then use that to draw the diagonal with asterisks.

	@author Stephanie-Angela Brauer	

*/

import java.util.Scanner;

public class RightHalfDiamond {
	public static void main(String[] args) {

		int stop;
		int column;

		Scanner sc = new Scanner (System.in);

		System.out.print ("Please enter an integer: ");
		stop = sc.nextInt(); 

		for (int row = 1; row <= stop; row++) {
			for (column = 1; column <= row-1; column++)
			System.out.print(".");
			System.out.print("*");
			System.out.println ();
		}

		for (int row = 1; row <= stop-1; row++) {
			for (column = 1; column < stop-row; column++)
			System.out.print(".");
			System.out.print("*");
			System.out.println ();              
		}
	}
}