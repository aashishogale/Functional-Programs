/***************************************************************************
* Purpose : To Perform factorization
*
*@author : Aashish
*@version : 1.8.0
*@since : 03-10-2017
****************************************************************************/
package com.bridgelabz.lib;


/**
 * @author aashish
 *
 */
public class Factors {
	public static void factor(int number) {
		int tempnumber=number;
		System.out.println("The prime factorization of " + number + " is: ");

		// for each potential factor
		for (int factor = 2; factor * factor <= tempnumber; factor++) {

			// if factor is a factor of n, repeatedly divide it out
			while (tempnumber % factor == 0) {
				System.out.println(factor + " ");
				tempnumber = tempnumber / factor;
			}
		}

		System.out.println(tempnumber);
	}

	public static void main(String[] args) {

		int number = Integer.parseInt(args[0]);
		factor(number);

	}
}
