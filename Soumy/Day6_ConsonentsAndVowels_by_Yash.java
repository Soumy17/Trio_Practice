package Yash;

import java.util.Scanner;

public class Day6_ConsonentsAndVowels_by_Yash { 
	public static void main(String []args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string to check the number of Vowels and Consonents : ");
	String string=sc.next();
	int vowels=0;
	
	string =string.toLowerCase();
	              for(int i=0 ; i<string.length() ; i++)
	                 {
		                if( string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u')
		                   {
		                	   vowels++;
		                  }
	            	  
	            	  
	                   }
	       System.out.println("The number of vowels are : "+ vowels);       
	       System.out.println("The number of consonents are : "+ (string.length()-vowels));       
	              
	}

}
