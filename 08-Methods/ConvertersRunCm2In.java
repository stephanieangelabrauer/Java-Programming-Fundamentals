/**

	This program will prompt the user to enter a double value
	in centimeters, then output the result in inches.

	This version of the program will use the Converters class
	to calculate the equivalent in inches.

   @author Stephanie-Angela Brauer
*/

import java.util.Scanner;

public class ConvertersRunCm2In {

   public static void main (String[] args) {

      Scanner sc = new Scanner (System.in);

      double cm;
      double inch;

      System.out.print ("Enter a value in centimeters: ");
      cm = sc.nextDouble ();

      inch = Converters.cm2in(cm);

      System.out.println (cm + " centimeters = " + inch + " inches.");
   }
}
