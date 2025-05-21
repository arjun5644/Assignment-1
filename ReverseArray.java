package main;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int RevArr[]=new int[arr.length];
		System.out.println("Enter 5 array elements: "+ "\t");
		 for (int i=0;i<arr.length;i++){
			 
			int n=sc.nextInt();
			arr[i]=n;
		}
		 int s=0;
		 for(int j=arr.length-1;j>=0;j--) {
			 RevArr[s]=arr[j];
			 s++;
			 
		 }
		 System.out.println("original array:");
		 for(int l=0;l<RevArr.length;l++) {
			 System.out.print(arr[l] + "\t");
		 }
		 System.out.println("");
		 System.out.println("reversed array:");
		 for(int k=0;k<RevArr.length;k++) {
			 System.out.print(RevArr[k] + "\t");
			 
		 }
		 
		 

	}

}
