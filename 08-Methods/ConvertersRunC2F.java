/**

	This program will prompt the user to enter a double value
	in Celsius, then output the result in Fahrenheit.

	This version of the program will use the Converters class
	to calculate the equivalent in Fahrenheit.

   @author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class ConvertersRunC2F {

   public static void main (String[] args) {

      Scanner sc = new Scanner (System.in);

      double c;
      double f;

      System.out.print ("Enter a value in Celsius: ");
      c = sc.nextDouble ();

      f = Converters.c2f(c);

      System.out.println (c + " Celsius = " + f + " Fahrenheit.");
   }
}