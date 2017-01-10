/**

	This program will prompt the user to enter a double value in meters,
   then output the result in feet.

	This version of the program will use the Converters class
	to calculate the equivalent in feet.

   @author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class ConvertersRunMetr2Ft {

   public static void main (String[] args) {

      Scanner sc = new Scanner (System.in);

      double metr;
      double ft;

      System.out.print ("Enter a value in meters: ");
      metr = sc.nextDouble ();

      ft = Converters.metr2ft(metr);

      System.out.println (metr + " meters = " + ft + " feet.");
   }
}