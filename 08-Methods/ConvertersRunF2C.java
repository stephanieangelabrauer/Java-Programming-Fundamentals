/**

	This program will prompt the user to enter a double value
	in Fahrenheit, then output the result in Celsius.

	This version of the program will use the Converters class
	to calculate the equivalent in Celsius.

   @author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class ConvertersRunF2C {

   public static void main (String[] args) {

      Scanner sc = new Scanner (System.in);

      double c;
      double f;

      System.out.print ("Enter a value in Fahrenheit: ");
      f = sc.nextDouble ();

      c = Converters.f2c(f);

      System.out.println (f + " Fahrenheit = " + c + " Celsius.");
   }
}