/**

	This Java program inputs the height and width of a rectangle, then draws a open rectangle of asterisks.

	@author Stephanie-Angela Brauer	

*/

import java.util.Scanner;

public class OpenRectangle {
	public static void main(String[] args) {

		int height;
		int width;

		Scanner sc = new Scanner (System.in);

		System.out.print ("Please enter an integer for height: ");
		height = sc.nextInt(); 

		System.out.print ("Please enter an integer for width: ");
		width = sc.nextInt();


		for ( int column = 1; column <= width; column++) {
			System.out.print("*");
		}

		System.out.print("\n");

		for ( int row = 1; row <= height-2; row++) {
			System.out.print ("*");

			for (int column = 1; column <= width-2; column++)
			System.out.print (" ");
			System.out.println ("*");
		}

		for ( int column = 1; column <= width; column++) {
			System.out.print("*");
		}
			
		System.out.print("\n");

	}
}