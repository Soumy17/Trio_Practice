import java.util.Scanner;

public class Day_6_Vowels_and_Consonents_by_Yash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
	System.out.println("Eneter the string to cunt the vowels and consonents");
	
	String str = sc.nextLine();
	int vowel = 0;
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' ||
				str.charAt(i)=='o' || str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U') {
			vowel++;
		}
	}
		
	System.out.println("The total number of vowel is "+ vowel);
	System.out.println("The total number od consonents is "+ (str.length()-vowel));

	}

}
