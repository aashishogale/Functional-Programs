/****************************************
*
* Purpose:To print the leap year
*
*@author aashish
*@version 1.0
*@since 7/08/2017
****************************************/

package com.bridgelabz.lib;

public class LeapYear {
	public static boolean checkLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);

		if (checkLeap(year)) {

			System.out.println("It is a leap year");
		} else {
			System.out.println("not a leap year");
		}

	}

}
