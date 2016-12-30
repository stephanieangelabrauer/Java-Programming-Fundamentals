/**

	This program input an integer value, then loop from 1 to that value.

	For each loop iteration the current value, its square number and its square root will be print.

	The for loop will be used.

	@author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class ForLoopPrintValueSquarenumberSquareroot {
	public static void main(String [] args) {

		Scanner sc = new Scanner (System.in);

		System.out.print ("Please enter an integer value: ");
		int y = sc.nextInt();

		for (int i=1; i<=y; i++) {
			System.out.print (+i);
			System.out.print (", ");
			System.out.print (i*i);
			System.out.print (", ");
			System.out.println (Math.sqrt(i));
		}
	}
}
