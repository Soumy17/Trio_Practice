import java.util.Scanner;

public class Day_4_SubArray {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the length od an Array");
		int n =   sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the element of an array");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("the sub array of an given array is");
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
		
	}
	

}
