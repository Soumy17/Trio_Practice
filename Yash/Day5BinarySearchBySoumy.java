package com.dcc;

import java.util.*;
public class Day5BinarySearchBySoumy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		System.out.println("Enter the elements of the array in only sorted manner: ");
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to be search in the array : ");
		int ele = sc.nextInt();
		int left = arr[0];
		int right = arr.length-1;
		int index = binarySearch(arr, left,right, ele);
		if(index == 0) {
			System.out.println("Element not found in the given array");
		}else { 
			System.out.println("Element found at "+index);
		}
		
	}
	
	static int binarySearch(int []arr, int start,int last, int ele) {
		
		int mid = (start+last)/2;
		
		if(start<=last) {
			if(arr[mid]==ele) {
				return mid;
			}else if(ele>mid) {
				return binarySearch(arr,mid+1,last,ele);
			}else {
				return binarySearch(arr,start,mid-1,ele);
			}
		}
		return 0;
	}

}
