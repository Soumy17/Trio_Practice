package com.dcc;

// TO find min max from the array
import java.util.*;
public class Day1MinMaxYash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]<=min) {
				min = arr[i];
			}else if(arr[i]>=max) {
				max  = arr[i];
			}
		}
		
		System.out.println("Minimum number is " + min);
		System.out.println("Maximum number is " + max);
	}
}
