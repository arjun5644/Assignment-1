package main;

import java.util.*;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print table:");
		int n=sc.nextInt();
		int i=1;
		while(i<11) {
			System.out.println(n+" x "+i+" = "+n*i);
			i++;
		}

	}

}
