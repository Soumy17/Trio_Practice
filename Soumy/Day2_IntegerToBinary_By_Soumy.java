package Soumy;

import java.util.Scanner;

public class Day2_IntegerToBinary_By_Soumy 

   {
	
	                 public static void main(String []args) 
	                       
	                         {

				                          Scanner sc = new Scanner(System.in);
				                          System.out.println("Enter any number ");
				                          int num = sc.nextInt();
				
				                          intToBinary(num);
				
				                          System.out.println("Using wrapper class: ");
				                          System.out.println(Integer.toBinaryString(num));
			                 
	                         }

	                 
	                 public static void intToBinary(int x) 
	                 
	                        {
				
	            	                       int[] binary = new int[50];
	            	                       int i = 0;
	            	                       while(x>0) 
	            	                         {
					                             binary[i] = x%2;
					                             i++;
					                             x = x/2;
				                             }
				                
	            	                       printBinary(binary,i);
		
	                        }
			
		        	static void printBinary(int[] binary,int i)
		        	
		        	       {
		        		
				                           System.out.println("Without using wrapper class: ");
				                           for(int j=i-1;j>=0;j--) 
				                             {
					                       System.out.print(binary[j]);
					                       
				                             }
				                           
				                           System.out.println();
				                           
		                	}
			
		
			

  }
