/***************************************************************************
* Purpose :User Input and Replace String Template “Hello <<UserName>>, How are you?” 
*
* @author   Aashish
* @version  1.0
* @since    03-10-2017
****************************************************************************/
package com.bridgelabz.lib;
import java.util.Random;

public class RandomCoupon {

	static Random random;
	static int count;
	static int []tempArr;
	
	

	//static initialization
	static {
		random = new Random();
	}

	public static int generateRandom(int num) {
		int randomnum;
		randomnum=random.nextInt();
		return randomnum;
	}
	
	public static int countDistinct(int couponNo) {
	
	
		int []arr=new int[couponNo];	
	
		tempArr=new int[couponNo];
	
		for(int i=0;i<arr.length;i++) {
			arr[i]=RandomCoupon.generateRandom(couponNo);
			if(RandomCoupon.checkRepeat(arr[i],couponNo)) {
				count++;
			}
			else {
				count++;
 				tempArr=new int[couponNo];
				countDistinct(couponNo);
			}
	
		}

		return count;		
	}

	public static boolean checkRepeat(int num,int limit) {
		int j=0;		
		
				

		while(j<tempArr.length) {
		System.out.println(tempArr[j]);
			if(tempArr[j]==num) {
				return false;
			}
        j++;
		}
		tempArr[j]=num;
		return true;
	
	}

	public static void main(String args[]) {
		int n=4;
		System.out.println(RandomCoupon.countDistinct(n));
	}
}
				
				
	 	
		
	

	
