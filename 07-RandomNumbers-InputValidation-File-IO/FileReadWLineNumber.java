/**
	This program asks the user for the name of a file, then displays the content of the file with each line
	preceded by a line number followed by a colon. The line numbering starts at 1.

	If the file is not found an appropriate message will be printed.

	@author Stephanie-Angela Brauer

*/

import java.util.Scanner;
import java.io.*;

public class FileReadWLineNumber {
	public static void main(String[] args) throws IOException {

		Scanner keyboard = new Scanner(System.in);
	      
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the file name: ");
		String filename = input.next();

		File file = new File (filename);
		if (!file.exists()) {
		   System.out.println("The file " + filename + " has not been found.");
		   System.exit(0);
		}
		
		Scanner inputFile = new Scanner (file);

		int lineNum = 1;
		while (inputFile.hasNext()) {
			System.out.println(lineNum + ":" + inputFile.nextLine());
			lineNum++;
		}
	}
}