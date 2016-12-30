/**

	This program inputs an integer value representing the number of hours worked and
	a double value representing a pay rate,then calculate the gross pay due to the employee.

	The gross pay is calculated as hours times rate for hours less than or equal to 40. For
	hours over 40 the gross pay is calculated using 1.5 times for the hours worked over 40
	and standard pay for hours less than or equal to 40.

	This program does not allow user input to cause a crash.

	@author Stephanie-Angela Brauer	

*/

import java.util.Scanner;

public class GrossPay {
   public static void main(String[] args) {

		int inthours;
		double rate;

		boolean waitingForInput = true;

		Scanner sc = new Scanner (System.in);

		System.out.print ("Please enter the number of hours worked: ");
		inthours = sc.nextInt();

		System.out.print ("Please enter the pay rate: ");
		rate = sc.nextDouble();

		double doublehours = inthours;

		if (inthours <= 40) {
			double grosspay = doublehours * rate;
			System.out.println ("The gross pay is: " + grosspay);	
		}
		else {
			double grosspay = 40 * rate + (doublehours - 40) * rate * 1.5;
			System.out.println ("The gross pay is: " + grosspay);
		}
	}
}
