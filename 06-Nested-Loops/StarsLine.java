/**

	This Java program uses a loop that will input an integer from the user, then print that many stars horizontally.

	The program will end when the user enters "Exit".

	@author Stephanie-Angela Brauer	

*/

import java.util.Scanner;

public class StarsLine {
	public static void main(String[] args) {

		String input;
		int stop;
		int count;

		Scanner sc = new Scanner (System.in);

		System.out.print ("Please enter an integer or \"Exit\" to stop: ");
		input = sc.nextLine();

		while (!input.equalsIgnoreCase ("Exit")) {
			stop = Integer.parseInt(input);

			for ( count = 1; count <= stop; count++) {
				System.out.print("*");
			}	

			System.out.println ();
			System.out.print ("Please enter another integer or \"Exit\" to stop: ");
			input = sc.nextLine();
		}
	}
}
