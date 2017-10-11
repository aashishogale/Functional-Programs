/***************************************************************************
* Purpose :User Input and Replace String Template “Hello <<UserName>>, How are you?” 
*
* @author   Aashish
* @version  1.0
* @since    03-10-2017
****************************************************************************/
package com.bridgelabz.lib;

import java.util.Scanner;

/**
 * @author aashish
 *
 */
public class UserNameEnter {

	public static boolean checkLength(String uName) {
		return (uName.length() > 3);
	}

	public static void main(String args[]) {
		String str = "Hello <<UserName>>, How are you?”;";
		Scanner sc = new Scanner(System.in);
		String userName;
		System.out.println("Enter user name");

		userName = sc.nextLine();
		String newstr = str.replaceAll("<<UserName>>", userName);
		if (checkLength(userName)) {
			System.out.println(newstr);
		} else {
			System.out.println("Error");
		}

	}
}
