/**

	This program will prompt the user for his name, his age and his birthmonth,
   then output a message saying how old the user will be at his next birth month.

	This version of the program will use Scanner for input and System.out.println for output.

   @author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class ScannerReadingStringAndInt {
   public static void main (String[] args) {

      String name;
      int age;
      String birthmonth;
      
      Scanner sc = new Scanner (System.in);

      System.out.print ("Please enter your name: ");
      name = sc.nextLine ();  

      System.out.print ("Please enter your age: ");
      age = sc.nextInt ();
      sc.nextLine ();

      System.out.print ("Please enter your birthmonth: ");
      birthmonth = sc.nextLine ();

      int upcomingAge = age + 1;

      System.out.println (name + " will become " + upcomingAge + " next " + birthmonth + ". " );
   }
}
