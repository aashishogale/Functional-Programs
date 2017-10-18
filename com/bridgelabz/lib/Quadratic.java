
/****************************
*
* Purpose:To find quadratic roots
*
*@author aashish
*@version 1.0
*@since 04/10/2017
*****************************/

package com.bridgelabz.lib;

import java.util.Scanner;

/**
 * @author aashish
 *
 */
public class Quadratic {

	static int a, b, c;

	public static void enterRoots() {
		// use scanneranner object to get user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a");
		a = scanner.nextInt();
		System.out.println("enter b");
		b = scanner.nextInt();
		System.out.println("enter c");
		c = scanner.nextInt();
	}

	public static void calculateRoots(int a, int b, int c) {

		double root1, root2, d;
		// use formula
		d = (b * b) - (4 * a * c);

		// use the if else condition
		if (d > 0) {

			System.out.println("roots are real and unequal");
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			root2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("first root is:" + root1);
			System.out.println("second root is:" + root2);
		}

		else if (d == 0) {

			System.out.println("roots are equal and real");
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			System.out.println("roots are " + root1);
		} else {

			System.out.println("roots are imaginary");
		}

	}

	public static void main(String args[]) {

		enterRoots();
		calculateRoots(a, b, c);

	}
}
