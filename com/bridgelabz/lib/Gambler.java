/***************************************************************************
* Purpose : to calculate percentage of wins using stakes goal and trials
*
*@author : Aashish
*@version : 1.8.0
*@since : 03-10-2017
****************************************************************************/

package com.bridgelabz.lib;


public class Gambler { 
	public static int simulateTrial(int stake,int goal,int trials) {
		int bets = 0;        // total number of bets made
        	int wins = 0;        // total number of games won

		for (int i = 0; i < trials; i++) {

		
			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5) cash++;     
				else                     cash--;     
			}
            if (cash == goal) wins++;
             
		
        	}
	return wins;
	}
	
		

    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]);    // number of trials to perform

        
		int wins=simulateTrial(stake,goal,trials);
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        
    }
}


