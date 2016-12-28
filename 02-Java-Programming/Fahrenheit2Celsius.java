/**

	This program will prompt the user for a double value for Fahrenheit, calculate the equivalent in Celsius, then output the results.

	This version of the program will use the JOptionPane methods for both input and output.

    @author Stephanie-Angela Brauer

*/

import javax.swing.JOptionPane;

public class Fahrenheit2Celsius {
	public static void main (String[] args) {

		double F;
		double C;

		F = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for Fahrenheit:"));

		C = ( F - 32 ) * 5 / 9;

		JOptionPane.showMessageDialog(null, F + " Fahrenheit = " + C + " Celsius.", "Fahrenheit to Celsius Converter", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}