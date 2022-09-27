import java.util.Scanner;

public class Day_3_ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		
		char ch;  String str1="";
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			str1= ch+str1;
		}
		
		
		System.out.println("The Reverse String is "+str1);
		if(str1.equalsIgnoreCase(str)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
		
		
		//by using String Builder
		
		System.out.println("Enter a String ");
		
		String str2  = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(str2);
		
		System.out.println("The String is "+sb.toString());
		
		
		
		StringBuilder revstr = sb.reverse();
		
		System.out.println("reverse string is "+revstr.toString());
		
		if(str2.equalsIgnoreCase(revstr.toString())) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}	
			
		
		
	}

}
