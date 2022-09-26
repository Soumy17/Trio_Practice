package Yash;

import java.util.Scanner;

public class Day3_ReverseStringAndCheckPalindrome_by_Yash {
	
	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        
        String string=sc.nextLine();
        
        
        
        //Reverse string without using string builder
        
        System.out.println("Without using Stringbuilder : ");
        for(int j=string.length()-1;j>=0;j--) 
        {
        System.out.print(string.charAt(j));	
       
        }
       
       
        
        System.out.println();
        
        
        //Reverse using stringbuilder
        
        StringBuilder strbldr = new StringBuilder(string);
        
        System.out.println("Using Stringbuilder : ");
       System.out.println(strbldr.reverse());
       
       String rev=strbldr.toString();  
        
       
       if(string.equalsIgnoreCase(rev))
       {
    	   System.out.println("Yes , It is palindrome");
       }
       else
       {
    	   System.out.println("No , It is not palindrome");
       }
	}

}
