import java.util.Scanner;

/**

    This program print the smallest value of the array
	and the location where the smallest value was found.

	@author Stephanie-Angela Brauer

*/

public class FindSmallestValueArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);		

		System.out.println("How many values do you want to enter?");
		int maxsize = sc.nextInt();		

		int[] numbers = new int[maxsize];		
	
		for (int i = 0; i < maxsize; i++) {
			System.out.print("Please enter value " + (i+1) + ": ");
			numbers[i]= sc.nextInt();
		}	
	
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < smallest)
				smallest = numbers[i];
		}
		
		int thePosition = sequentialSearch(numbers, smallest);
	
		System.out.println ();	
		System.out.println ("The smallest value of the array is: " + smallest);	
		System.out.println ("The smallest value was found at position: " + (thePosition+1) );
	}
	
	public static int sequentialSearch(int[] array, int value) {
		int index;        // Loop control variable
		int element;      // Element the value is found at
		boolean found;    // Flag indicating search results

		// Element 0 is the starting point of the search.
		index = 0;

		// Store the default values element and found.
		element = -1;
		found = false;

		// Search the array.
		while (!found && index < array.length) {
			
			if (array[index] == value) {
				found = true;
				element = index;
			}
			
			index++;
		}
		
		return element;
	}	
}