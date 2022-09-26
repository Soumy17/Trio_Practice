package com.dcc;


import java.util.*;
import java.util.Arrays;
public class Day3SubArrayRatnesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size ");
		int arrSize = sc.nextInt();
		int arr[] = new int[arrSize];
		System.out.println("Enter array element ");
		for(int i=0;i<arrSize;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter starting point of SubArray ");
		int startPoint = sc.nextInt();
		System.out.println("Enter ending point of SubArray ");
		int endPoint = sc.nextInt();
		
		findingSubArray(arr,startPoint,endPoint);
	}
	
	static void findingSubArray(int[] arr, int sp, int ep) {
		System.out.println("SubArray from starting point " + sp + " and ending point is ");
		for(int i = sp; i<=ep;i++) {
			System.out.print((arr[i]) + " ");
		}
	}

}
