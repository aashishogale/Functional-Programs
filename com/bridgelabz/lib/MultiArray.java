/***************************************************************************
* Purpose : MultiArray
*
*@author : Aashish
*@version : 1.8.0
*@since : 03-10-2017
****************************************************************************/
package com.bridgelabz.lib;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

public class MultiArray {
	static boolean [][]barr;
	static int [][]iarr;
	static double [][]darr;
	static int rows,columns;

	
	public static void iInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and columns");
		rows=sc.nextInt();
		columns=sc.nextInt();
		iarr=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				
			
				iarr[i][j]=sc.nextInt();
			
			}		
		}
		
	}

	public static void iOutput()  {

		PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
			pw.println(iarr[i][j]);
			pw.flush();
			}
		}
	}

	public static void bInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and columns");
		rows=sc.nextInt();
		columns=sc.nextInt();
		iarr=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				
			
				barr[i][j]=sc.nextBoolean();
			
			}		
		}
		
	}

	public static void bOutput()  {

		PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
			pw.println(barr[i][j]);
			pw.flush();
			}
		}
	}

	public static void dInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and columns");
		rows=sc.nextInt();
		columns=sc.nextInt();
		iarr=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				
			
				darr[i][j]=sc.nextDouble();
			
			}		
		}
		
	}

	public static void dOutput()  {

		PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
			pw.println(darr[i][j]);
			pw.flush();
			}
		}
	}

	public static void main(String args[])	throws Exception {
		
		MultiArray.iInput();
		try {
			iOutput();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
				
				
				

		
		
