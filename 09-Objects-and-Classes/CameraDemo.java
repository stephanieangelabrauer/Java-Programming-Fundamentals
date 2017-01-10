/**

	This program will demonstrate and test our Camera object.

	@author Stephanie-Angela Brauer

*/
public class CameraDemo {

	public static void main(String[] args) {

		// first create the Camera object

		Camera myCam = new Camera();

		// print the initial state

		System.out.println(myCam);
		System.out.println();
	
		// next, we will turn on the Camera, turn off the flash, increase the colorstrength one time,
		// increase the brightness two times, increase the volume three times,
		// then reprint the Camera state.

		myCam.setPower(true);
		myCam.setFlash(false);
		myCam.colorstrengthUp();
		myCam.brightnessUp();
		myCam.brightnessUp();
		myCam.volumeUp();	
		myCam.volumeUp();	
		myCam.volumeUp();	
		System.out.println(myCam);
		System.out.println();

		// next we will turn on the flash again, decrease the colorstrength three times,
		// decrease the brightness two times, decrease the volume one time and print state again

		myCam.setFlash(true);
		myCam.colorstrengthDown();
		myCam.colorstrengthDown();		
		myCam.colorstrengthDown();
		myCam.brightnessDown();
		myCam.brightnessDown();
		myCam.volumeDown();		
		System.out.println(myCam);
		System.out.println();

		// finally we will set the colorstrength to 4, set the brightness to 4,
		// set the volume to 4, turn power off, and print state again

		myCam.setColorstrength(4);
		myCam.setBrightness(4);
		myCam.setVolume(4);		
		myCam.setPower(false);
		System.out.println(myCam);
		System.out.println();

	}
}