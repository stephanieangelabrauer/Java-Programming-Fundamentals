import java.util.Scanner;

/**

	This program prints a chart showing the number
	of stars in each array element.

	@author Stephanie-Angela Brauer

*/

public class StarsChartArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);		

		System.out.println("How many values do you want to enter?");
		int maxsize = sc.nextInt();		

		int[] numbers = new int[maxsize];		
	
		for (int i = 0; i < maxsize; i++) {
			System.out.print("Please enter value " + (i+1) + ": ");
			numbers[i]= sc.nextInt();
		}	

		for ( int i = 0; i <= numbers.length-1; i++) {		
			System.out.print (i + "| ");	
		
			for ( int j = 1; j <= numbers[i]; j++) {
				System.out.print("*");
			}

			System.out.println("(" + numbers[i] + ")");
		}
	}	
}