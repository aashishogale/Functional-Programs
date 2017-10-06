/***************************************************************************
* Purpose : To Perform factorization
*
*@author : Aashish
*@version : 1.8.0
*@since : 03-10-2017
****************************************************************************/
package com.bridgelabz.lib;

public class Factors {
	public static void factor(long number) {
		System.out.print("The prime factorization of " + number + " is: ");

		// for each potential factor
		for (long factor = 2; factor * factor <= number; factor++) {

			// if factor is a factor of n, repeatedly divide it out
			while (number % factor == 0) {
				System.out.println(factor + " ");
				number = number / factor;
			}
		}

		System.out.println(number);
	}

	public static void main(String[] args) {

		long number = Long.parseLong(args[0]);
		factor(number);

	}
}
