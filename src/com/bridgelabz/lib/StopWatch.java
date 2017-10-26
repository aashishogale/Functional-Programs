/***************************************************************************
* Purpose : To create stopwatch to count time of program
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
public class StopWatch {

	public static long start;

	public StopWatch() {
		start = System.nanoTime();
	}

	public static double elapsedTime() {
		long now = System.nanoTime();
		return (double)(now - start);
	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			System.out.println("nanoseconds " +StopWatch.elapsedTime()/1000000000.0);
		}
	}
}
