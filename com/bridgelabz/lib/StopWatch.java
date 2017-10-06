/***************************************************************************
* Purpose : To create stopwatch to count time of program
*
* @author   Aashish
* @version  1.0
* @since    04-10-2017
****************************************************************************/
package com.bridgelabz.lib;

import java.util.Scanner;

public class StopWatch {

	private static long start;

	public StopWatch() {
		start = System.currentTimeMillis();
	}

	public static long elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - start);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		if (sc.hasNext()) {
			System.out.println(StopWatch.elapsedTime());
		}
	}
}
