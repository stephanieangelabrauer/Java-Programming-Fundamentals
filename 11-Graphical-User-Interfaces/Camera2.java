/**

	The Camera2 class represents version 2 of our camera object.
	All the methods which are not needed for the CameraGUI but
	needed for the text based demo program were	changed to comments (-->//).
	
	@author Stephanie-Angela Brauer

*/

public class Camera2 {
//    private final static int MIN_COLORSTRENGTH=1;
//    private final static int MAX_COLORSTRENGTH=7;
//    private final static int MIN_BRIGHTNESS=1;
//    private final static int MAX_BRIGHTNESS=7;
//    private final static int MIN_VOLUME=0;
//    private final static int MAX_VOLUME=6;

	private boolean power;
	private boolean flash;
	private int colorstrength;
	private int brightness;
	private int volume;

// /**
//	The Camera2 constructor will initialize a new camera object that is
//	powered off, with flash on, with colorstrength 4, with brightness 4 and with volume 3.
//
//*/
//	public Camera2() {
//		power = false;
//		flash = true;
//		colorstrength = 4;
//		brightness = 4;
//		volume = 3;
//	}

/**
	The getPower method will return the value of the power variable.
	@return The current power setting.
*/
	public boolean getPower() {
		return power;
	}
/**	
	The getFlash method will return the value of the flash variable.
	@return The current flash setting.
*/
	public boolean getFlash() {
		return flash;
	}
/**	
	The getColorstrenght method will return the value of the colorstrength variable.
	@return The current colorstrength setting.
*/
	public int getColorstrength() {
		return colorstrength;
	}
/**	
	The getBrightness method will return the value of the brightness variable.
	@return The current brightness setting.
*/
	public int getBrightness() {
		return brightness;
	}
/**
	The getVolume method will return the value of the volume variable.
	@return The current volume setting.
*/
	public int getVolume() {
		return volume;
	}
/**
    The powerOn() method will turn on the camera's power.
 */
	public void powerOn() {
		power=true;
	}
 /**
    The powerOff() method will turn off the camera's power.
 */
	public void powerOff() {
		power=false;
	}
 /**
    The setPower method will set the power field to the
    value stored in the newPower argument.
    @param newPower The new value for the power.
 */
	public void setPower(boolean newPower) {
		power = newPower;
	}
 /**
    The togglePower method will turn the camera on if it is off and off if it is on.
 */
	public void togglePower() {
		power = !power;
	}	
 /**
	The setFlash method will set the flash field to the
	value stored in the newFlash argument.
	@param newFlash The new value for the flash.
 */
	public void setFlash(boolean newFlash) {
		flash = newFlash;
	}
/**
    The toggleFlash method will turn the camera's flash on if it is off and off if it is on.
 */
	public void toggleFlash() {
		flash = !flash;
	}
 /**
	The setColorstrength method will set the colorstrength to the
	value stored in the newColorstrength argument.
	@param newColorstrength The new colorstrength for the channel.
 */
	public void setColorstrength(int newColorstrength) {
		colorstrength = newColorstrength;
	}
 /**
	The setBrightness method will set the brightness field to the
	value stored in the newBrightness argument.
	@param newBrightness The new brightness for the volume.
 */
	public void setBrightness(int newBrightness) {
		brightness = newBrightness;
	}
 /**
    The setVolume method will set the volume field to the
    value stored in the newVolume argument.
    @param newVolume The new value for the volume.
 */
	public void setVolume(int newVolume) {
		volume = newVolume;
	}
	
// /**
//	The colorstrengthUp() method will increase the colorstrength number of our Camera object.
//*/
//	public void colorstrengthUp()
//	{
//		if (colorstrength < MAX_COLORSTRENGTH)
//		colorstrength++;
//	}

// /**
//	The colorstrengthDown() method will decrease the colorstrength number of our Camera object.
//*/
//	public void colorstrengthDown()
//	{
//  		if (colorstrength > MIN_COLORSTRENGTH)  		
//			colorstrength--;
//	}

// /**
//	The brightnessUp() method will increase the brightness number of our Camera object.
// */
//	public void brightnessUp()
//	{
//		if (brightness < MAX_BRIGHTNESS)	
//		brightness++;
//	}

// /**
//	The brightnessDown() method will decrease the brightness number of our Camera object.
//*/
//	public void brightnessDown()
//	{
//  		if (brightness > MIN_BRIGHTNESS)  	
//   		brightness--;
//	}

// /**
//    The volumeUp() method will increase the Camera's volume.
// */
//	public void volumeUp()
//	{
//		if (volume < MAX_VOLUME)	
//		volume++;
//	}
	
// /**
//    The volumeDown() method will decrease the Camera's volume.
// */
//	public void volumeDown()
//	{
//	if (volume > MIN_VOLUME)
//     	volume--;
//	}

// /**
//	The toString() method will return a String representing the object state.
// */
//	public String toString()
//	{
//		String state;
//		state= "Power:          " + power;
//		state+="\nFlash:          " + flash;
//		state+="\nColorstrength:  " + colorstrength;
//		state+="\nBrightness:     " + brightness;
//		state+="\nVolume:         " + volume;
//		return state;
//	}
}
