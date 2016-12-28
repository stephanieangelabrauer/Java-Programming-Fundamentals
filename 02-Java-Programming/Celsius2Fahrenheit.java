/**

	This program will prompt the user for a double value for Celsius, calculate the equivalent in Fahrenheit, then output the results.

	This version of the program will use the JOptionPane methods for both input and output.

    @author Stephanie-Angela Brauer

*/

import javax.swing.JOptionPane;

public class Celsius2Fahrenheit {
	public static void main (String[] args) {

		double C;
		double F;

		C = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for Celsius:"));

		F = C * 9 / 5 + 32;

		JOptionPane.showMessageDialog(null, C + " Celsius = " + F + " Fahrenheit", "Celsius to Fahrenheit Converter", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}