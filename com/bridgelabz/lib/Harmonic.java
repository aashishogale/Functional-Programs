/***************************************************************************
* Purpose : to create a class for forming harmonic function
*
*@author : Aashish
*@version : 1.8.0
*@since : 18-08-2017
****************************************************************************/



package com.bridgelabz.lib;
public class Harmonic {

    public static double harmonicNumber(double mNumber) {

        double nharmonic = mNumber;

        //use float to get result
        float result = 0;

        // use for loop to calculate the harmonic no
        for (float i = 1; i <= nharmonic; i++) {

            result = result + (1 / i);
            System.out.print("1/" + i + "+");
        }
        return result;

	}
	public static void main(String args[]) {
		double number=Double.parseDouble(args[0]);
		System.out.println(harmonicNumber(number));
	}


}

