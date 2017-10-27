/***************************************************************************
* Purpose : TicTacToe
*
* @author   Aashish
* @version  1.0
* @since    04-10-2017
****************************************************************************/
package com.bridgelabz.lib;

import java.util.Scanner;

/**
 * @author aashish
 *
 */
public class TicTacToe {
	public static char[][] arr;

	public static Scanner scanner = new Scanner(System.in);
	public static int number;

	public static void initArray() {

		arr = new char[number][number];
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				arr[i][j] = '-';
			}
		}
	}

	public static void userEnter() {

		int row;
		int column;
		System.out.println("enter value");
		row = scanner.nextInt();
		column = scanner.nextInt();
		if (row <= number && column <= number) {
			if (arr[row - 1][column - 1] == '-') {
				arr[row - 1][column - 1] = 'X';
			} else if (arr[row - 1][column - 1] == 'O' || arr[row - 1][column - 1] == 'X') {
				System.out.println("pls enter correct value");
				TicTacToe.userEnter();
			}
		} else {

			System.out.println("pls enter correct value");
			TicTacToe.userEnter();
		}

	}

	public static void computerEnter() {

		int flag = 0;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				if (arr[i][j] == '-') {

					arr[i][j] = 'O';
					flag = 1;
					break;
				}

			}
			if (flag == 1)
				break;
		}

	}

	public static boolean victoryCheck() {

		int i = 0;
		int j = 0;

		int d1count = 0;
		int d2count = 0;
		int hcount = 0;
		int vcount = 0;
		for (int m = 0; m < number; m++) {
			hcount = 0;
			for (int n = 0; n < number; n++) {
				if (arr[m][n] == 'X') {
					hcount++;
				}
				if (hcount == number) {
					return true;
				}
			}
		}

		for (int n = 0; n < number; n++) {
			vcount = 0;
			for (int m = 0; m < number; m++) {
				if (arr[m][n] == 'X') {
					vcount++;
				}
				if (vcount == number) {
					return true;
				}
			}
		}

		i = 0;
		j = 0;

		while (i < number - 1 && j < number - 1) {

			if (arr[i][j] == 'X' && (arr[i][j] == arr[i + 1][j + 1])) {
				d1count++;

			}
			i++;
			j++;

		}

		i = 0;
		j = number - 1;
		while (i < number - 1 && j > 0) {

			if (arr[i][j] == 'X' && (arr[i][j] == arr[i + 1][j - 1])) {
				d2count++;
			}
			i++;
			j--;
		}
		return (d1count == number - 1 || d2count == number - 1);

	}

	public static boolean computerVictoryCheck() {

		int i = 0;
		int j = 0;

		int d1count = 0;
		int d2count = 0;
		int hcount = 0;
		int vcount = 0;
		for (int m = 0; m < number; m++) {
			hcount = 0;
			for (int n = 0; n < number; n++) {
				if (arr[m][n] == 'O') {
					hcount++;
				}
				if (hcount == number) {
					return true;
				}
			}
		}

		for (int n = 0; n < number; n++) {
			vcount = 0;
			for (int m = 0; m < number; m++) {
				if (arr[m][n] == 'O') {
					vcount++;
				}
				if (vcount == number) {
					return true;
				}
			}
		}

		i = 0;
		j = 0;

		while (i < number - 1 && j < number - 1) {

			if (arr[i][j] == 'O' && (arr[i][j] == arr[i + 1][j + 1])) {
				d1count++;
				System.out.println(d1count);
			}
			i++;
			j++;

		}

		i = 0;
		j = number - 1;
		while (i < number - 1 && j > 0) {

			if (arr[i][j] == 'O' && (arr[i][j] == arr[i + 1][j - 1])) {
				d2count++;
			}
			i++;
			j--;
		}
		return (d1count == number - 1 || d2count == number - 1);

	}

	public static boolean drawCheck() {

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				if (arr[i][j] == '-') {
					return false;

				}

			}
		}
		return true;
	}

	public static void display() {

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		System.out.println("enter number of rows and columns");
		number = scanner.nextInt();
		initArray();
		display();
		do {
			userEnter();

			if (victoryCheck()) {
				display();
				System.out.println("You Win");
				break;

			}
			computerEnter();
			if (computerVictoryCheck()) {
				display();
				System.out.println("computer wins");
				break;

			}

			if (drawCheck()) {
				System.out.println("draw");
				break;
			}
			display();
		} while (!computerVictoryCheck() || !victoryCheck() || !drawCheck());
	}
}
