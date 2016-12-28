/**

	This program will prompt the user to enter two integers,then output their quotient and remainder.

	This version of the program will use Scanner for input and System.out.printf for output.

   @author Stephanie Angela Brauer

*/

import java.util.Scanner;

public class ConvertTotalMinutes2HoursAndMinutes {
   public static void main (String[] args) {

      int tmin;
      int h;
      int min;

      Scanner sc = new Scanner (System.in);

      System.out.print ("Please enter a value for total minutes: ");
      tmin = sc.nextInt ();

      h = tmin / 60;
      min = tmin % 60;

      System.out.printf ("%d total minutes are %d hour(s) and %d minutes.\n", tmin, h, min);
   }
}
