/****************************************
*
* Purpose:To print the distance between two points
*
*@author aashish
*@version 1.0
*@since 03/10/2017
****************************************/

package com.bridgelabz.lib;



public class Distance {
	public static double calcDistance(int x,int y) {
		
		//use math function
		double dist=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		return dist;	
		}
    public static void main(String args[]) {
		
		//command line arguments
        int pointA=Integer.parseInt(args[0]);
        int pointB=Integer.parseInt(args[1]);

        
         
        System.out.println("distance from "+pointA+ "and" +pointB+"is"+calcDistance(pointA,pointB));
}
}
