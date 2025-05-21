package main;
import java.util.*;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=0;
		
		
		do {
			if(n != 0) {
				int ld=n%10;
				sum+=ld;
				n=n/10;
				
			}
			
		
			
		}
		
		while(n !=0 );
		
		System.out.println("Sum of digits=" + sum);

	}

}
