package main;

import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. to find factorial:");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>0;i--) {
			fact=fact*i;
			
		}
		System.out.print("factorial= " + fact);
	}

}
