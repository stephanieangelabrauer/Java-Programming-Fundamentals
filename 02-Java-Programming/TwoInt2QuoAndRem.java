/**

	This program will prompt the user to enter two integers, then output their quotient and remainder.

	This version of the program will use Scanner for input and System.out.printf for output.

    @author Stephanie Angela Brauer

*/

import java.util.Scanner;

public class TwoInt2QuoAndRem {
	public static void main (String[] args) {

		int a;
		int b;
		int quotient;
		int remainder;

		Scanner sc = new Scanner (System.in);

		System.out.print ("Enter an integer a: ");
		a = sc.nextInt ();

		System.out.print ("Enter an integer b: ");
		b = sc.nextInt ();

		quotient = a / b;
		remainder = a % b;

		System.out.printf("The quotient is %d.", quotient);
		System.out.printf("The remainder is %d.\n", remainder);
	}
}