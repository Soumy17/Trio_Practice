package Soumy;

import java.util.Scanner;

public class Day5_BinarySearch_by_Soumy
 {

	 public static int binarySearch(int arr[], int first, int last, int key)
	              {  
	                       if (last>=first)
	                           {  
	                                int mid = first + (last - first)/2;  
	                                if (arr[mid] == key)
	                                  {  
	                                   return mid;  
	                                  }
	                       
	                       
	                                 if (arr[mid] > key)
	                                         {  
	                                               return binarySearch(arr, first, mid-1, key);  
	                                         }
	                                else
	                                         {  
	                                              return binarySearch(arr, mid+1, last, key);  
	                                         }  
	                            }  
	                  return -1;  
	           } 
	 
	 /*________________________________________________________________________________________________________________________________________________________*/
	   
	 
	 
	 public static void main(String args[])
	 
	       {  
	                      	Scanner sc=new Scanner(System.in);
	                     	System.out.println("Enter size of array");
	    	                int size=sc.nextInt();
	    	                int arr[]=new int[size];
	    	
	                        for(int i=0;i<size;i++)
	                            
	                            {
	        
	    	                       arr[i] = sc.nextInt(); 
	                            }
	        
	                       System.out.println("Enter the key to find : ");
	       
	                       int key = sc.nextInt();  
	                       int last=arr.length-1;  
	        
	                       int result = binarySearch(arr,0,last,key); 
	        
	        
	        
	                       if (result == -1)  
	                                     System.out.println("Given key is not present in the given array");  
	                     else  
	                                    System.out.println("Given key is present int array at the index of : "+result);  
	     }  

 }
