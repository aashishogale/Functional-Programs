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
	static char[][] arr;

	public static Scanner sc = new Scanner(System.in);

	public static void initArray() {

		arr = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = '-';
			}
		}
	}

	public static void userEnter() {

		int row, column;
		System.out.println("enter value");
		row = sc.nextInt();
		column = sc.nextInt();
		arr[row - 1][column - 1] = 'X';

	}

	public static void computerEnter() {

		int flag = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
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
		while (i < 3) {
			if (arr[i][j] == 'X')

				if ((arr[i][j] == arr[i][j + 1]) && (arr[i][j + 1] == arr[i][j + 2]))
					 {
					return true;
				}
			i++;
		}
		i=0;
		j=0;
		while (j < 3) {
			if (arr[i][j] == 'X')

				if
						 ((arr[i][j] == arr[i + 1][j]) && (arr[i + 1][j] == arr[i + 2][j])) {
					return true;
				}
			j++;
		}

		i = 0;
		j = 0;
		if (arr[i][j] == 'X')
			if ((arr[i][j] == arr[i + 1][j + 1]) && (arr[i + 1][j + 1] == arr[i + 2][j + 2])) {
				return true;
			}

		i = 0;
		j = 2;
		if (arr[i][j] == 'X')
			if ((arr[i][j] == arr[i + 1][j - 1]) && (arr[i + 1][j - 1] == arr[i + 2][j - 2])) {
				return true;
			}

		return false;

	}

	public static boolean computerVictoryCheck() {

		int i = 0;
		int j = 0;
		while (i < 3) {
			if (arr[i][j] == 'O')

				if ((arr[i][j] == arr[i][j + 1]) && (arr[i][j + 1] == arr[i][j + 2])) {
					return true;
				}
			i++;
		}
		i = 0;
		j = 0;

		while (j < 3) {

			if (arr[i][j] == 'O') {
				if ((arr[i][j] == arr[i + 1][j]) && (arr[i + 1][j] == arr[i + 2][j])) {
					return true;
				}
			}
			j++;
		}

		i = 0;
		j = 0;
		if (arr[i][j] == 'O')
			if ((arr[i][j] == arr[i + 1][j + 1]) && (arr[i + 1][j + 1] == arr[i + 2][j + 2])) {
				return true;
			}

		i = 0;
		j = 2;
		if (arr[i][j] == 'O')
			if ((arr[i][j] == arr[i + 1][j - 1]) && (arr[i + 1][j - 1] == arr[i + 2][j - 2])) {
				return true;
			}

		return false;

	}

	public static boolean drawCheck() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == '-') {
					return false;

				}

			}
		}
		return true;
	}

	public static void display() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {

		initArray();
		display();
		do {
			userEnter();
			computerEnter();
			display();
			if (victoryCheck()) {
				System.out.println("You Win");
				break;

			}
			if (computerVictoryCheck()) {
				System.out.println("computer wins");
				break;

			}
			if (drawCheck()) {
				System.out.println("draw");
				break;
			}
		} while (!computerVictoryCheck() || !victoryCheck());
	}
}
