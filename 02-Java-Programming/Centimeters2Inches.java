/**

	This program will prompt the user for a double value for centimeters, calculate the equivalent in inches, then output the results.

	This version of the program will use Scanner for input and System.out.printf for output.

   @author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class Centimeters2Inches {
   public static void main (String[] args) {

      double cm;
      double in;

      Scanner sc = new Scanner (System.in);

      System.out.print ("Enter a value for centimeters: ");
      cm = sc.nextDouble ();

      in = cm * 0.393700787;

      System.out.printf ("%f centimeters = %f inches\n", cm, in);
   }
}