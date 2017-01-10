import java.util.Scanner;

/**

    This program uses a loop in order to sum the odd numbered array elements.
	
	@author Stephanie-Angela Brauer

*/

public class SumOddArrayElements {

   public static void main(String[] args) {
		int oddSum = 0;

		Scanner sc = new Scanner (System.in);	  
	  
		System.out.println("How many values do you want to enter?");
		int maxsize = sc.nextInt();		

		int[] numbers = new int[maxsize];		
	
		for (int i = 0; i < maxsize; i++) {
			System.out.print("Please enter value " + (i+1) + ": ");
			numbers[i]= sc.nextInt();
		}
	  
		for (int i = 0; i< maxsize; i++)
			if (i % 2 != 0)
				oddSum = oddSum + numbers[i];		
			
		System.out.println();			
		System.out.println("The sum of the odd numbered array elements is "+oddSum);	
   }
}