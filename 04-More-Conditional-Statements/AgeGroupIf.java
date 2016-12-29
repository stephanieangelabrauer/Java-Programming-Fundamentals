/**

	This program will prompt the user to input his String name and his integer age,
	then assign a greeting with an age related message based on the following table:

	Age Input											Message
	less than zero										You have typed an invalid age.
	greater than or equal to zero but less than 18		You are young!
	greater than or equal to 18 but less than 35		You are of age and can do what you want!
	greater than or equal to 35							You have a lot of life experience!

	@author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class AgeGroupIf {
	public static void main(String[] args) {

		String name;
		int age;

		Scanner sc = new Scanner (System.in);
	
		System.out.print ("Please enter your name: ");
		name = sc.nextLine ();

		System.out.print ("Please enter your age: ");
		age = sc.nextInt ();

		System.out.print(" Hallo " + name + "! ");

		if (age >= 35)
			System.out.println("You are " + age + " years old and have a lot of life experience.");
		else if (age >= 18)
			System.out.println("You are of age and can do what you want.");
		else if (age >= 0)
			System.out.println("You are young!");
		else
			System.out.println("You have typed an invalid age.");
   }
}