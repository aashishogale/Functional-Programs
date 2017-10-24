/***************************************************************************
* Purpose : MultiArray
*
*@author : Aashish
*@version : 1.8.0
*@since : 03-10-2017
****************************************************************************/
package com.bridgelabz.lib;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

/**
 * @author aashish
 *
 */
public class MultiArray {
	public static boolean[][] barr;
	public static int[][] iarr;
	public static double[][] darr;
	public static int rows;
	public static int columns;

	public static void iInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter rows and columns");
		rows = scanner.nextInt();
		columns = scanner.nextInt();
		iarr = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				iarr[i][j] = scanner.nextInt();

			}
		}

	}

	public static void iOutput() {

		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				pw.println(iarr[i][j]);
				pw.flush();
			}
		}
	}

	public static void bInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter rows and columns");
		rows = scanner.nextInt();
		columns = scanner.nextInt();
		iarr = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				barr[i][j] = scanner.nextBoolean();

			}
		}

	}

	public static void bOutput() {

		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				pw.println(barr[i][j]);
				pw.flush();
			}
		}
	}

	public static void dInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter rows and columns");
		rows = scanner.nextInt();
		columns = scanner.nextInt();
		iarr = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				darr[i][j] = scanner.nextDouble();

			}
		}

	}

	public static void dOutput() {

		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				pw.println(darr[i][j]);
				pw.flush();
			}
		}
	}

	public static void main(String args[]) throws Exception {

		MultiArray.iInput();
		try {
			iOutput();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
