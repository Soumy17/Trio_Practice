package com.yash;

// ATOS HACKATHON QUESTION
// ELECTROSTATICS
// Doug is fond of change, every now and then he tries to do new things. This time, he caught up with a rod comprising of negative(N) and positive(P) charges. He is asked to calculate the maximum net electrostatic field possible in the region due to the rod.
// Note Electrostatic field = Total charge * 100

// input1 = integer array denoting the magnitude of each charge
// input2 =String denoting nature of each charge, i entry represents a sign of charge at i location in input1
// input3 = No. if charges it holds(length of input1)

// return maximum electrostatic field possible in the rod

// input1: {4,3,5}
// input2:PNP
// input3: 3

// output: 600


import java.util.*;
import java.lang.Math;
public class Day8ATOSquestionByYash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input3 = sc.nextInt();
		int input1[] = new int[input3];
		for(int i=0;i<input3;i++) {
			input1[i] = sc.nextInt();
		}
		sc.nextLine();
		String input2 = sc.next();
		int sum=0;
		
		
		for(int j=0;j<input2.length();j++) {
			if(input2.charAt(j)=='P') {
					sum += input1[j]; 
			}
		}
		
		for(int j=0;j<input2.length();j++) {
			if(input2.charAt(j)=='N') {
					sum -= input1[j]; 
			}
		}
		
		System.out.println(sum);
		int res = Math.abs(sum);
		System.out.println(res*100);
		
		sc.close();
	}

}
