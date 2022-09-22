package com.trio;

import java.util.Scanner;




public class Day_1_Find_Min_Max {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the length of array");
	int n = sc.nextInt();
	int arr[] = new int[n];
	
	System.out.println("Enter the element in array");
	
	for(int i=0;i<arr.length;i++) {
		arr[i] =sc.nextInt();
	}
	
	System.out.println("Smallest elemnt in array is "+findsmallest(arr));
	System.out.println("Smallest elemnt in array is "+findlargest(arr));
	
}

private static int findlargest(int[] arr) {
	// TODO Auto-generated method stub
	int large=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>large) {
			large=arr[i];
		}
	}
	return large;
}

private static int findsmallest(int[] arr) {
	// TODO Auto-generated method stub
	
	int small = arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<small) {
			small=arr[i];
		}
	}
	return small;
}

}
