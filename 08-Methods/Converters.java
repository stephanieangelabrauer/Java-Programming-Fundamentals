/**

	This java program will compile a class called Converters,
	which contains methods that allow conversion between
	inches and centimeters and
	degrees Celsius and degrees Fahrenheit and
	kilometers and miles and
	meters and feet.	

   You cannot run this class because there is no main method in it.

   @author Stephanie-Angela Brauer

*/

public class Converters {
   public static double in2cm(double in) {
	  return in*2.54;
   }

   public static double cm2in(double cm) {
      return cm/2.54;
   }

   public static double c2f(double c) {
      return 9.0/5.0 * c + 32.0;
   }

   public static double f2c(double f) {
      return 5.0/9.0 * (f - 32.0);
   }

   public static double k2m(double k) {
	  return k * 0.6213712;
   }

   public static double m2k(double m) {
      return m * 1.609344;
   }

   public static double metr2ft(double metr) {
      return metr * 3.28095;
   }

   public static double ft2metr(double ft) {
      return ft * 0.30479;
   }
}