import java.util.Scanner;

/**

    This program determines the number of odd and the number of even values in an array.
	
	@author Stephanie-Angela Brauer

*/

public class OddEvenValuesCount {

	public static void main(String[] args) {

		int evencount = 0;
		int oddcount = 0;
	
		Scanner sc = new Scanner (System.in);

		System.out.println("How many values do you want to enter?");
		int maxsize = sc.nextInt();		

		int[] numbers = new int[maxsize];		
	
		for (int i = 0; i < maxsize; i++) {
			System.out.print("Please enter value " + (i+1) + ": ");
			numbers[i]= sc.nextInt();
		}
	
		for (int i = 0; i < maxsize; i++) {
			if (numbers[i]%2 != 0) {
				oddcount++;
			}
			else{
				evencount++;
			}
		}
	
		System.out.println();	
		System.out.println("Number of odd values : " + oddcount);
		System.out.println("Number of even values: " + evencount);
	}
}