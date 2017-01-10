/**

	Camera2Demo is an interactive version of the CameraDemo.
	It uses the new and improved Camera2 class.

	@author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class Camera2Demo {

	public static void main (String args[]) {

    	int menuSelection;

		Camera2 myCam = new Camera2();

		Scanner sc = new Scanner (System.in);

		System.out.println("Canon");
		System.out.println("image ANYWARE");
		System.out.println();
		System.out.println("Welcome!");
		
		do {
	    	System.out.println("\nThe current state of the Camera object is:\n" + myCam);

	    	System.out.println("\nMain Menu\n");
			System.out.println("1...Power");
			System.out.println("2...Flash");
			System.out.println("3...Colorstrength Up");
			System.out.println("4...Colorstrength Down");
			System.out.println("5...Brightness Up");
			System.out.println("6...Brightness Down");	
			System.out.println("7...Volume Up");
			System.out.println("8...Volume Down");
			System.out.println("0...Exit");
			System.out.println();
			System.out.print("Please enter your selection value between 0 and 8: ");

		    if (sc.hasNextInt())
	    		menuSelection=sc.nextInt();
		    else {
				sc.nextLine();		// clear the input buffer
	    		menuSelection = -1; 	// The switch statement will handle this default case.
			}

			System.out.println();

			if (!myCam.getPower() && menuSelection>1) {
			System.out.println("Please turn the Camera on first!");
			continue;
			}

		    switch (menuSelection) {
	        	case 1:myCam.togglePower();break;
		        case 2:myCam.toggleFlash();break;		
		        case 3:myCam.colorstrengthUp();break;
		        case 4:myCam.colorstrengthDown();break;
		        case 5:myCam.brightnessUp();break;
		        case 6:myCam.brightnessDown();break;					
	            case 7:myCam.volumeUp();break;
		        case 8:myCam.volumeDown();break;
		        case 0:System.out.println("Goodbye!");break;
		        default:System.out.println("*** Please re-enter an integer value between 0 and 8.");break;
		    }
		}
		while (menuSelection != 0);
		System.out.println();
		System.out.println("Canon");
		System.out.println("image ANYWARE");
		System.out.println();
	}
}
