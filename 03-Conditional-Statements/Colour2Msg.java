/**

	This program will ask the user to input the color representing a Homeland Security Advisory System code
	and will output a message describing the color code in words.

	@author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class Colour2Msg {
	public static void main(String[] args) {
		
		String colour;

		Scanner sc = new Scanner (System.in);

		System.out.print ("Enter a color representing a Homeland Security Advisory System code: ");
		colour = sc.nextLine ();

		if (colour.equalsIgnoreCase ("RED"))
			System.out.println("SEVERE");
		else if (colour.equalsIgnoreCase ("ORANGE"))
			System.out.println("HIGH");
		else if (colour.equalsIgnoreCase ("YELLOW"))
			System.out.println("ELEVATED");
		else if (colour.equalsIgnoreCase ("BLUE"))
			System.out.println("GUARDED");
		else if (colour.equalsIgnoreCase ("GREEN"))
			System.out.println("LOW");
		else
			System.out.println("invalid input");
	}
}