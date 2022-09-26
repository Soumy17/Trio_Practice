package Ratnesh;

import java.util.Scanner;

public class Day4_SubArray_by_Ratnesh 

  {

	     public static void main(String[] args) 
	
	         {
		
 
		                  Scanner sc=new Scanner(System.in);
		                  System.out.println("Enter the size of array : ");
		                  int size=sc.nextInt();
		                  int array[] = new int [size];
		
		                          for(int i=0; i<size ;i++)
		                                {
			                                array[i] = sc.nextInt();
			                            }
		                 subary(array,size);
	         }
	
		
		static void subary( int  arr[],int length) 
		
		    {
			             int count=0;
			
			                    for(int i=0;i<length;i++)
			                     {
				                     for(int j=i;j<length;j++)
				                        {
					                      for(int k=i;k<j;k++)
					                                 {
						                                  System.out.print(arr[k]+ " ");
       					                             }
					                       System.out.println();
					                     }
				                 }
			
             }
	

	}
