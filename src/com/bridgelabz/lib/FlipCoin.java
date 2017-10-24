/***************************************************************************
* Purpose : to calculate percentage of heads and tails in flipped coins
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
public class FlipCoin {
	public static int countFlips(int total) {

		int heads = 0;

		// initialize for loop for the number of times heads and tails
		for (int i = 0; i < total; i++) {

			// check condition for heads or tails
			if (Math.random() < 0.5) {

				heads++;

			}

		} // end of loop
		return (calcPercentage(heads, total));

	}

	public static int calcPercentage(int number, int total) {

		int headPercentage = 100 * number / total;
		return headPercentage;
	}

	public static void main(String args[]) {

		int total = Integer.parseInt(args[0]);

		System.out.println(countFlips(total));

	}
}
