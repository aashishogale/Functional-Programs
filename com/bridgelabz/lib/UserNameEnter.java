/***************************************************************************
* Purpose :User Input and Replace String Template “Hello <<UserName>>, How are you?” 
*
* @author   Aashish
* @version  1.0
* @since    03-10-2017
****************************************************************************/
package com.bridgelabz.lib;

import java.util.Scanner;

public class UserNameEnter {

	public static boolean checkLength(String uName) {
		return (uName.length()>3);
	}






	
	public static void main(String args[]) {
	
		Scanner sc=new Scanner(System.in);
		String userName;
		System.out.println("Enter user name");
		userName=sc.nextLine();
		if(checkLength(userName)) {		
			System.out.println("Hello "+userName+" How are you");
		}
		else {
			System.out.println("Error");
		}
	
	}
}