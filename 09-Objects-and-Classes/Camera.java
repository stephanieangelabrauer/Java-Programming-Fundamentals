/**

	The Camera class models a basic camera object.

	@author Stephanie-Angela Brauer

*/

public class Camera {

	private boolean power;
	private boolean flash;
	private int colorstrength;
	private int brightness;
	private int volume;

	/**
		The Camera constructor will initialize a new Camera object that is
		powered off, with flash, with colorstrength 4, with brightness 4 and with volume 4.
	*/
	public Camera() {
		power = false;
		flash = true;
		colorstrength = 3;
		brightness = 3;
		volume = 3;
	}

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
		The setPower method will set the power field to the
	    value stored in the newPower argument.
	    @param newPower The new value for the power.
	*/
	public void setPower(boolean newPower) {
		power = newPower;
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
		The setColorstrength method will set the channel colorstrength to the
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
	
	/**
		The colorstrengthUp() method will increase the colorstrength number of our Camera object.
	*/
	public void colorstrengthUp() {
		colorstrength++;
	}

	/**
		The colorstrengthDown() method will decrease the colorstrength number of our Camera object.
	*/
	public void colorstrengthDown() {
    	colorstrength--;
	}

	/**
		The brightnessUp() method will increase the brightness number of our Camera object.
	*/
	public void brightnessUp() {
		brightness++;
	}

	/**
		The brightnessDown() method will decrease the brightness number of our Camera object.
	*/
	public void brightnessDown() {
    	brightness--;
	}

	/**
		The volumeUp() method will increase the Camera's volume.
	*/
	public void volumeUp() {
		volume++;
	}
	
	/**
		The volumeDown() method will decrease the Camera's volume.
	*/
	public void volumeDown() {
     	volume--;
	}

	/**
		The toString() method will return a String representing the object state.
	*/
	public String toString() {
		String state;
		state= "Power:			" + power;
		state+="\nFlash:			" + flash;
		state+="\nColorstrength:		" + colorstrength;
		state+="\nBrightness:		" + brightness;
		state+="\nVolume:			" + volume;
		return state;
	}
}