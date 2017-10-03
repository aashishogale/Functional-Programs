/***************************************************************************
* Purpose : to calculate percentage of wins using stakes goal and trials
*
*@author : Aashish
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;


public class Gambler { 
	public static int simulateTrial(int trial,int) {
		 for (int i = 0; i < trials; i++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
        }
	}
	public static checkForWin(
		

    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]);    // number of trials to perform

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
       

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}
