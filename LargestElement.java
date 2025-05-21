package main;
import java.util.*;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter 5 array elements: "+ "\t");
		 for (int i=0;i<arr.length;i++){
			 
			int n=sc.nextInt();
			arr[i]=n;
		}
		int max=arr[0];
		 for(int j=1;j<arr.length;j++) {
			 if (max<arr[j]) {
				 max=arr[j];
			 }
			 
		 }
		 
		 System.out.println("Largest element of array: " + max);
		 
	
		 }

	}


