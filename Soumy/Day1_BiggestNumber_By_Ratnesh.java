package Ratnesh;

import java.util.Scanner;

public class Day1_BiggestNumber_By_Ratnesh {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[] =new int[size];
	
		int large,small,i;
		for( i=0;i<size; i++) {
			array[i]=sc.nextInt();
			}
	
		int n = array.length;
		large=small=array[0];
		for(i=0;i<n;++i)
		{
		if(array[i]>large)
		large=array[i];

		if(array[i]<small)
			
		small=array[i];
		}

		System.out.println(" Smallest number is " + small );
		System.out.print(" Largest number is " + large );
		
	   }
	}

		
		

	


