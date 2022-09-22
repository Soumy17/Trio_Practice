package com.trio;

import java.util.Scanner;

public class Day_2_Convert_into_Binary {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
System.out.println("Enter any number");
		int num = sc.nextInt();
		
		
		inttobinary(num);
		findBinarywithoutWrapperClass(num);
		
		/*
		 * for(int i=0;i<index;i++) { System.out.println(tobinary[i]); }
		 */
	}
	


	private static void inttobinary(int num) {
		// TODO Auto-generated method stub
		int tobinary[] = new int[40];
		int index=0;
		
		for(int i=0;num>0;i++) {
			tobinary[index++] = num%2;
			num=num/2;
		}
		
		findBinary(tobinary,index);
		
	}



	private static void findBinarywithoutWrapperClass(int num) {
		// TODO Auto-generated method stub
		System.out.println("Using Wrapper Class");
		System.out.println(Integer.toBinaryString(num));
		
	}

	private static void findBinary(int[] tobinary, int index) {
		// TODO Auto-generated method stub
		System.out.println("\n without using wapper Class");
		for(int i = index-1;i>=0;i--) {
			System.out.print(tobinary[i]+" ");
		}
		
	}


	
	
	

}
