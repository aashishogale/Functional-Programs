/***************************************************************************
* Purpose : MultiArray
*
*@author : Aashish
*@version : 1.8.0
*@since : 03-10-2017
****************************************************************************/
package com.bridgelabz.lib;

import java.util.Scanner;

/**
 * @author aashish
 *
 */
public class SumIntegerZero {
	static int[] arr;
	static int size, count;

	public static void readArray() {

		System.out.println("enter size");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
	}

	public static int calcDistinct() {
		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				for (int k = j + 1; k < size; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						count++;
					}
				}
			}
		}

		return count;
	}

	public static void main(String args[]) {

		readArray();
		System.out.println("No of distinct pairs" + calcDistinct());

	}
}
