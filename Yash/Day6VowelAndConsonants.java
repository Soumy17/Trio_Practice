package com.yash;

import java.util.*;
public class Day6VowelAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int vowels=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U')
			{
				vowels++;
			}
		}
		System.out.println("Vowels are: " + vowels);
		System.out.println("Consonants are "+ (str.length()-vowels));
		sc.close();
	}

}
