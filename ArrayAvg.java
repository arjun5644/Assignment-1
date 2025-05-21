package main;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
			
		}
		int avg=sum/arr.length;
		System.out.println("Avg of array elements: " + avg);
		
		

	}

}
