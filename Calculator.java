package main;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student marks:");
		int n=sc.nextInt();
		if(n<=100 && n>=0) {
			if(n>=90) {
				System.out.println("Grade A");
			}
			else 
				if(n>=80){
					System.out.println("Grade B");
					
				}
				else 
					if(n>=70) {
						System.out.println("Grade C");
					}
					else 
						if(n>=60) {
							System.out.println("Grade D");
						}
						else 
							if(n<60) {
								System.out.println("Grade F");
							}
		
		}
		else {
			System.out.println("Invalid Marks");
		}
		

	}

}
