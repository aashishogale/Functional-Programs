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

	static Random random;
	static int count = 1;
	static int[] tempArr;

	static {
		random = new Random();
	}

	public static int generateRandom() {
		int randomnum;
		randomnum = (int) (Math.random() * 10);
		return randomnum;
	}

	public static int countDistinct(int couponNo) {

		int[] arr = new int[couponNo];
		int randomNo;
		int flag;

		tempArr = new int[couponNo];
		arr[0] = RandomCoupon.generateRandom();
		// System.out.println(arr[0]);

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

		return count;
	}

	public static void main(String args[]) {
		int n = 4;
		System.out.println("no of Coupons required" + RandomCoupon.countDistinct(n));
	}
}
