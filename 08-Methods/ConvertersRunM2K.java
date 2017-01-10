/**

	This program will prompt the user to enter a double value in kilometers,
   then output the result in miles.

	This version of the program will use the Converters class
	to calculate the equivalent in miles.

   @author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class ConvertersRunM2K {
   public static void main (String[] args) {

      Scanner sc = new Scanner (System.in);

      double k;
      double m;

      System.out.print ("Enter a value in miles: ");
      m = sc.nextDouble ();

      k = Converters.m2k(m);

      System.out.println (m + " miles = " + k + " kilometers.");
   }
}