/***************************************************************************
* Purpose : to create a class for forming String  function
*
*@author : Aashish
*@version : 1.8.0
*@since : 04-10-2017
****************************************************************************/



package com.bridgelabz.lib;




public class StringFunction {




	public static void permutate(String permString) {
		int number = permString.length();
		char[] permArray = new char[number];
		for (int i = 0; i < number; i++)
			permArray[i] = permString.charAt(i);
		permutate(permArray, number);
	}


	private static void permutate(char[] permArray, int number) {
		if (number == 1) {

			System.out.println(new String(permArray));
			return;
		}

		for (int i = 0; i < number; i++) {

			swap(permArray, i, number-1);

			permutate(permArray, number-1);

			swap(permArray, i, number-1);

		}
	}  


	private static void swap(char[] permArray, int i, int j) {

		char temp = permArray[i];
		permArray[i] = permArray[j];
		permArray[j] = temp;

	}

	public static void main(String args[]){
		
		System.out.println(StringFunction.permutate("abc"));
	}
		


