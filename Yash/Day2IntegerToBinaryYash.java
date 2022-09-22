package com.dcc;

// To convert any number into binary

import java.util.*;
public class Day2IntegerToBinaryYash {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number of your Choice: ");
		int num = sc.nextInt();
		
		intToBinary(num);
		toBinaryUsingWrapper(num);
	}
//	without using wrapper class
	public static void intToBinary(int x) {
		int[] binary = new int[30];
		int i = 0;
		while(x>0) {
			binary[i] = x%2;
			i++;
			x = x/2;
		}
		printBinary(binary,i);
	}
	
	static void printBinary(int[] binary,int i) {
		System.out.println("Without using wrapper class: ");
		for(int j=i-1;j>=0;j--) {
			System.out.print(binary[j]);
		}
		System.out.println();
	}
	
//  using wrapper class
	
	static void toBinaryUsingWrapper(int num) {
		System.out.println("Using wrapper class: ");
		System.out.println(Integer.toBinaryString(num));
	}

}
