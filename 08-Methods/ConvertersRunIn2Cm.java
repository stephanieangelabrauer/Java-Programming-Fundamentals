/**

	This program will prompt the user to enter a double value in inches,
   then output the result in centimeters.

	This version of the program will use the Converters class
	to calculate the equivalent in centimeters.

   @author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class ConvertersRunIn2Cm {

   public static void main (String[] args) {

      Scanner sc = new Scanner (System.in);

      double cm;
      double inch;

      System.out.print ("Enter a value in inches: ");
      inch = sc.nextDouble ();

      cm = Converters.in2cm(inch);

      System.out.println (inch + " inches = " + cm + " centimeters.");
   }
}