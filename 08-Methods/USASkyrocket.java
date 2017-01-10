/**

	This program uses six methods to draw a nice USA Skyrocket.

	@author Stephanie-Angela Brauer

*/

public class USASkyrocket {
	
	public static void main (String[] args) {
		OpenTriangle();
		SpaceBtw2Stars();
		LetterUBtw2Stars();
		LetterSBtw2Stars();
		LetterABtw2Stars();
		SpaceBtw2Stars();
		UpHalfDblFrmdOpenHexagon();
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