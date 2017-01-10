/**

	This program uses six methods to draw a nice USA Skyrocket.

	The method called blastOff() will execute System.out.println() in a loop.
	
	@author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class USASkyrocketLoopSolution2 {

	public static void main (String[] args) {
		
		int enter;
		
		Scanner keyboard = new Scanner(System.in);
		
		OpenTriangle();
		SpaceBtw2Stars();
		LetterUBtw2Stars();
		LetterSBtw2Stars();
		LetterABtw2Stars();
		SpaceBtw2Stars();
		UpHalfDblFrmdOpenHexagon();
		
		System.out.println("Please press enter to launch the rocket: ");
		keyboard.nextLine();
		
		for ( int i = 0; i < 8; i++) {
			blastoff(i);
		}
	}

	public static void blastoff(int counter) {
		if  (counter == 0) {
			OpenTriangle();
			SpaceBtw2Stars();
			LetterUBtw2Stars();
			LetterSBtw2Stars();
			LetterABtw2Stars();
			SpaceBtw2Stars();
			UpHalfDblFrmdOpenHexagon();		
		}
		else if  (counter == 1) {
			SpaceBtw2Stars();
			LetterUBtw2Stars();
			LetterSBtw2Stars();
			LetterABtw2Stars();
			SpaceBtw2Stars();
			UpHalfDblFrmdOpenHexagon();		
		}
		else if  (counter == 2) {
			LetterUBtw2Stars();
			LetterSBtw2Stars();
			LetterABtw2Stars();
			SpaceBtw2Stars();
			UpHalfDblFrmdOpenHexagon();		
		}
		else if  (counter == 3) {
			LetterSBtw2Stars();
			LetterABtw2Stars();
			SpaceBtw2Stars();
			UpHalfDblFrmdOpenHexagon();		
		}
		else if  (counter == 4) {
			LetterABtw2Stars();
			SpaceBtw2Stars();
			UpHalfDblFrmdOpenHexagon();		
		}
		else if  (counter == 5) {
			SpaceBtw2Stars();
			UpHalfDblFrmdOpenHexagon();		
		}
		else if  (counter == 6) {
			UpHalfDblFrmdOpenHexagon();		
		}
		else {
			System.out.println("Rocket lounged");
		}
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
}