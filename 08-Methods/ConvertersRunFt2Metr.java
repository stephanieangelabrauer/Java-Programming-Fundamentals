/**

	This program will prompt the user to enter a double value
	in feet, then output the result in meters.

	This version of the program will use the Converters class
	to calculate the equivalent in meters.

   @author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class ConvertersRunFt2Metr {

   public static void main (String[] args) {

      Scanner sc = new Scanner (System.in);

      double metr;
      double ft;

      System.out.print ("Enter a value in feet: ");
      ft = sc.nextDouble ();

      metr = Converters.ft2metr(ft);

      System.out.println (ft + " feet = " + metr + " meters.");
   }
}