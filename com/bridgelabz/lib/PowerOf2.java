/***************************************************************************
* Purpose : To take command line argument n and calculate 2^n
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.lib;

public class PowerOf2 {

	public static double findPower(int number) {
		return (Math.pow(2, number));
	}

	public static void main(String args[]) {

		int npower = Integer.parseInt(args[0]);

		// use loop to increase powers for 2
		for (int i = 0; i <= npower; i++) {

			System.out.println((int) PowerOf2.findPower(i));
		}
	}
}
