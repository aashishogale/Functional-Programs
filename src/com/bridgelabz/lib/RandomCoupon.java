/***************************************************************************
* Purpose :Find Distinct Random coupon 
*
* @author   Aashish
* @version  1.0
* @since    03-10-2017
****************************************************************************/
package com.bridgelabz.lib;

import java.util.Random;

/**
 * @author aashish
 *
 */
public class RandomCoupon {

	public static Random random;

	public static int[] tempArr;
	public static int totalcount = 0;
	static {
		random = new Random();
	}

	public static int generateRandom() {
		int randomnum;
		randomnum = (int) (1000 + Math.random() * (9999 - 1000));
		return randomnum;
	}

	public static void countDistinct(int couponNo) {

		int[] arr = new int[couponNo];
		int randomNo;
		int flag;
		int count = 1;

		tempArr = new int[couponNo];
		arr[0] = RandomCoupon.generateRandom();

		for (int i = 1; i < arr.length; i++) {
			randomNo = RandomCoupon.generateRandom();

			flag = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] == randomNo) {

					flag = 1;
					break;

				}
			}

			if (flag == 0) {

				count++;

				arr[i] = randomNo;

			} else {
				i = i - 1;
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println("randm no  " + arr[i]);

		}
		System.out.println("count" + count);

	}

	public static void main(String args[]) {
		int n = 10;

		RandomCoupon.countDistinct(n);

	}
}
