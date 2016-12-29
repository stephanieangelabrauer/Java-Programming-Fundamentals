/**

	This program will prompt the user to input his String name and his integer age,
	then assign a greeting with an age related message based on the following table:

	Age Input											Message
	less than zero and greater than 100					You have typed an invalid age.
	greater than or equal to zero but less than 18		You are young!
	greater than or equal to 18 but less than 35		You are of age and can do what you want.
	greater than or equal to 35 but less than 101		You have much life experience.

	@author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class AgeGroupSwitch {
	public static void main(String[] args) {
	
		String name;
		int age;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Please enter your name: ");
		name = sc.nextLine ();

		System.out.print ("Please enter your age: ");
		age = sc.nextInt ();

		switch (age) {

			case 100:  	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 99:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 98:	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 97:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 96:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 95:  	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 94:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 93:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 92:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 91:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 90:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 89:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 88:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 87:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 86:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 85:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 84:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 83:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 82:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 81:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 80:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 79:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 78:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 77:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 76:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 75:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 74:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 73:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 72:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 71:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 70:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 69:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 68:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 67:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 66:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 65:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 64:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 63:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 62:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 61:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 60:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 59:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 58:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 57:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 56:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 55:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 54:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 53:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 52:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 51:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 50:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 49:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 48:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 47:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 46:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 45:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 44:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 43:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 42:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 41:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 40:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 39:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 38:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 37:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 36:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 35:   	System.out.println(" Hallo " + name + "! You have much life experience."); break;
			case 34:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 33:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 32:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 31:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 30:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 29:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 28:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 27:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 26:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 25:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 24:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 23:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 22:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 21:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 20:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 19:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 18:   	System.out.println(" Hallo " + name + "! You are of age and can do what you want."); break;
			case 17:    System.out.println(" Hallo " + name + "! You are young!"); break;
			case 16:    System.out.println(" Hallo " + name + "! You are young!"); break;
			case 15:    System.out.println(" Hallo " + name + "! You are young!"); break;
			case 14:    System.out.println(" Hallo " + name + "! You are young!"); break;
			case 13:    System.out.println(" Hallo " + name + "! You are young!"); break;
			case 12:    System.out.println(" Hallo " + name + "! You are young!"); break;
			case 11:    System.out.println(" Hallo " + name + "! You are young!"); break;
			case 10:    System.out.println(" Hallo " + name + "! You are young!"); break;
			case 9:    	System.out.println(" Hallo " + name + "! You are young!"); break;
			case 8:    	System.out.println(" Hallo " + name + "! You are young!"); break;
			case 7:    	System.out.println(" Hallo " + name + "! You are young!"); break;
			case 6:    	System.out.println(" Hallo " + name + "! You are young!"); break;
			case 5:    	System.out.println(" Hallo " + name + "! You are young!"); break;
			case 4:    	System.out.println(" Hallo " + name + "! You are young!"); break;
			case 3:    	System.out.println(" Hallo " + name + "! You are young!"); break;
			case 2:    	System.out.println(" Hallo " + name + "! You are young!"); break;
			case 1:		System.out.println(" Hallo " + name + "! You are young!"); break;
			case 0:    	System.out.println(" Hallo " + name + "! You are young!"); break;
			default:   	System.out.println(" Hallo " + name + "! You have typed an invalid age.");
		}
	}
}