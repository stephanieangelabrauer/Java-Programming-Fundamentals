/**

	This program input an integer value, then loop from 1 to that value.

	For each loop iteration the current value, its square number and its square root will be print.

	The while loop will be used.

	@author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class WhileLoopPrintValueSquarenumberSquareroot {
	public static void main(String [] args) {

		Scanner sc = new Scanner (System.in);

		System.out.print ("Please enter an integer value: ");
		int y = sc.nextInt();

		int i=1;

		while (i<=y) {
			System.out.print (+i);
			System.out.print (", ");
			System.out.print (i*i);
			System.out.print (", ");
			System.out.println (Math.sqrt(i));
			i++;
		}
	}
}
