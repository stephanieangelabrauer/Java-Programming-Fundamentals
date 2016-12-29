/**

	This program will promt the user for an integer value between 0 and 5
	and will output an appropriate text message based on the following table:

	5 Strongly Agree
	4 Agree
	3 Neutral
	2 Disagree
	1 Strongly Disagree
	0 Not Applicable

	@author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class Int2TxtSwitch {
	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner (System.in);

		System.out.print ("Please enter an integer value between 0 and 5: ");
		n = sc.nextInt ();

		switch (n)
		{
		case 5:	 	 System.out.println("Strongly Agree"); break;
		case 4:	 	 System.out.println("Agree"); break;
		case 3:	 	 System.out.println("Neutral"); break;
		case 2:	  	 System.out.println("Disagree"); break;
		case 1:	  	 System.out.println("Strongly Disagree"); break;	
		case 0:	  	 System.out.println("Not Applicable"); break;
		default:  	 System.out.println("invalid input"); break;
		}
	}
}