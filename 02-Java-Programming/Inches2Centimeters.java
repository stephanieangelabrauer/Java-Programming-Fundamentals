/**
	
   This program will prompt the user to enter a double value for inches, calculate the equivalent in cm, then output the results.

	This version of the program will use Scanner for input and System.out.println for output.

   @author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class Inches2Centimeters {
   public static void main (String[] args) {

      double in;
      double cm;

      Scanner sc = new Scanner (System.in);

      System.out.print ("Enter a value for inches: ");
      in = sc.nextDouble ();

      cm = in * 2.54;

      System.out.println (in + " inches = " + cm + " centimeters");
   }
}