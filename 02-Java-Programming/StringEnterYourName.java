/**

  This program will prompt the user to enter his name, then output a greeting for that person.

  This version of the program will use Scanner for input and System.out.println for output.

  @author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class StringEnterYourName {
  public static void main (String[] args) {

    String name;

    Scanner sc = new Scanner (System.in);

    System.out.print ("Hello! Please enter your name: ");
    name = sc.nextLine ();

    System.out.println ("Hello " + name + "! Welcome to my Java program!");
  }
}