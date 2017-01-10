/**

	This program uses six methods to draw a nice USA Skyrocket.

	The method called blastOff() will execute System.out.println() in a loop.

	@author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class USASkyrocketLoop {
	
	public static void main (String[] args) {
		OpenTriangle();
		SpaceBtw2Stars();
		LetterUBtw2Stars();
		LetterSBtw2Stars();
		LetterABtw2Stars();
		SpaceBtw2Stars();
		UpHalfDblFrmdOpenHexagon();		

		blastOff();
	}

	/**
		Draws an open triangle.
	*/
	public static void OpenTriangle() {
		System.out.println("    *    ");
		System.out.println("   * *   ");
		System.out.println("  *****  ");
	}

	/**
		Draws space between 2 stars.
	*/
	public static void SpaceBtw2Stars() {
		System.out.println("  *   *  ");
	}

	/**
		Draws the letter U between 2 stars.
	*/
	public static void LetterUBtw2Stars() {
		System.out.println("  * U *  ");
	}

	/**
		Draws the letter S between 2 stars.
	*/
	public static void LetterSBtw2Stars() {
		System.out.println("  * S *  ");
	}

/**
	Draws the letter A between 2 stars.
*/
	public static void LetterABtw2Stars() {
		System.out.println("  * A *  ");
	}

	/**
		Draws the upper half of a double framed open hexagon.
	*/
	public static void UpHalfDblFrmdOpenHexagon() {
		System.out.println("  *****  ");
		System.out.println(" **   ** ");
		System.out.println("**     **");
	}


	/**
		This method will execute System.out.println() in a loop.
	*/
	public static void blastOff() {
		String enter;

		Scanner sc = new Scanner (System.in);

		System.out.println ("Please press enter to launch this nice shape again... ");
		enter = sc.nextLine ();

		while (!enter.equals ('\n')) {
			OpenTriangle();
			SpaceBtw2Stars();
			LetterUBtw2Stars();
			LetterSBtw2Stars();
			LetterABtw2Stars();
			SpaceBtw2Stars();
			UpHalfDblFrmdOpenHexagon();
		
			System.out.println ("Please press enter to launch this nice shape again... ");
			enter = sc.nextLine ();
		}
	}
}