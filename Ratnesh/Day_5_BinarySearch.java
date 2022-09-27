import java.util.Scanner;
import java.util.Arrays;
public class Day_5_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]  = new int[n];
		
		System.out.println("Enter the elemrnt of array");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the number you wnat to serach");
		int key=sc.nextInt();
		
		
		Arrays.sort(arr);
		
		BinarySerach(arr,n,key);

	}

	private static void BinarySerach(int[] arr, int n, int key) {
		// TODO Auto-generated method stub
		int last = arr.length-1;
		int first = 0;
		int mid=(first+last)/2;
		
		while(first<=last) {
			if(arr[mid]<key) {
				first = mid+1;
			}else if(arr[mid]==key) {
				System.out.println("ELement is fount at index "+mid);
				break;	
			}else {
				last = mid-1;
			}
			mid = (first+last)/2;
			
			
		}
		
		if(first>last) {
			System.out.println("Not found");
		}
		
	}

}
