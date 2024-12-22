package lk.ac.pdn.util;

public class CircleUtil {
	
	//private final double TWO_PI = 2 * Math.PI;		  //instance variable
	private static final double TWO_PI = 2 * Math.PI;  	  //class variable

	public static double perimeter(final double r) { //Don't change r in any case
		
		return TWO_PI * r; //this PI value more faster and more accurate
	}
}
