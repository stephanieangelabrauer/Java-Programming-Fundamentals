/**

	This program that will use a loop to input temperature values in Celsius, then convert these values to Fahrenheit.

	This program will end when the user enters Exit.	

	@author Stephanie-Angela Brauer	

*/

import java.util.Scanner;

public class Celsius2Fahrenheit {
	public static void main(String[] args) {

		String input;
		double celsius;
		double fahrenheit;
		
		Scanner sc = new Scanner (System.in);     
		     
		System.out.print ("Please enter the temperature in celsius or \"Exit\" to stop: ");
		input = sc.nextLine ();
		
		while (!input.equalsIgnoreCase ("Exit")) {
			
			celsius = Double.parseDouble (input);

			fahrenheit = 1.8 * celsius + 32;
			
			System.out.print("celsius " + input);
			System.out.print(" = ");
			System.out.println("fahrenheit " + fahrenheit);

			System.out.print ("Please enter the temperature in celsius or \"Exit\" to stop: ");
			input = sc.nextLine ();
		}
	}
}