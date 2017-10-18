/****************************************
*
* Purpose:To calculate windchill factor
*
*@author aashish
*@version 1.0
*@since 7/08/2017
****************************************/

package com.bridgelabz.lib;

import java.util.Scanner;

/**
 * @author aashish
 *
 */
public class WindChill {
	static double temperature;
	static double velocity;

	public static void enterValues() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter temperature");
		temperature = scanner.nextDouble();
		System.out.println("enter velocity");
		velocity = scanner.nextDouble();
	}

	public static double calculateWc() {

		double windChill;

		// apply windchill formula
		windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16);
		return windChill;
	}

	public static void main(String args[]) {

		enterValues();
		System.out.println(calculateWc());
	}
}
