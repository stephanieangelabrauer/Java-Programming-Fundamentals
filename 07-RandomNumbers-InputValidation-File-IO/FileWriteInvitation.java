/**

	This program takes the output file MyFriends.txt and uses it to print an invitation to my Bday Party.

	Each friend's name in the datafile will be used in a personal invitation.
	
	The invitations will be printed at once with a row of dashes before the first
	invitation, between each invitation, and after the last invitation.

	@author Stephanie-Angela Brauer	

*/

import java.util.Scanner;
import java.io.*;

public class FileWriteInvitation {
	public static void main(String[] args) throws IOException {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the filename: ");
		String filename = keyboard.nextLine();

		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		while (inputFile.hasNext()) {
			String friendName = inputFile.nextLine();
			System.out.println("------------------------------------------");
			System.out.print("Dear ");
			System.out.print(friendName);
			System.out.println(",");
			System.out.println();
			System.out.println ("You are invited to my Bday party.");
			System.out.println(); 
			System.out.println ("It will take place on June 13th at Sydney Darling Harbour.");
			System.out.println(); 
			System.out.println("I will be very happy to see you ;)");
			System.out.println();
			System.out.println("Stephanie-Angela Brauer");
		}

		System.out.println("------------------------------------------");

		inputFile.close();
	}
}