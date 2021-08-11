package geeks.arrays.prob;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {28, 7, 12, 28, 34, 1, 14 ,3, 23, 16 ,12, 8 ,20, 18, 24, 31 ,9 ,10, 23 ,7 ,17, 17 ,31 ,1, 21 ,5 ,9, 6, 13 ,32 ,27, 17, 13 ,26};
		 long [] arr2 = {1,3,5,2,2};
	//	printFrequency(arr,34);
		 equilibriumPoint(arr2, 5);
		 
		 ArrayList ar = new ArrayList();
		// ar.get()
	

	}
	
	
	 public static void  printFrequency1(int arr[], int n){
		 StringBuffer sb=new StringBuffer();
		
			System.out.println("Initial  array: "+Arrays.toString(arr));
		 // Your code here
		// Your code here
		 for(int i=0;i<n;i++)
			 arr[i]=arr[i]-1;

		System.out.println("Step 1: "+Arrays.toString(arr));
		
		for(int i=0;i<n;i++) {
			
			arr[arr[i]%n]= arr[arr[i]%n]+n; //
			//** n is added for each frequency of element at index of that element 
		}
		System.out.println("Step 2: "+Arrays.toString(arr));
		for(int i=0;i<n;i++) {
			sb.append(arr[i]/n+" ");  // freq equal to how many times it is divisible by n
			
		}
 

		System.out.println("Result Array : "+sb.toString().trim());

		
	        
	    }
	 
	public static void printFrequency(int arr[], int n) {

		StringBuffer sb = new StringBuffer();

		// Your code here
		// Your code here
		for (int i = 0; i < n; i++)
			arr[i] = arr[i] - 1;

		for (int i = 0; i < n; i++) {

			arr[arr[i] % n] = arr[arr[i] % n] + n;
		}

		for (int i = 0; i < n; i++) {

			sb.append(arr[i] / n + " ");

		}

		System.out.println(sb.toString());

	}
	
	public static int equilibriumPoint(long arr[], int n) {

		long sum = 0;
		for (int i = 0; i < n; i++)
			sum = sum + arr[i];
		int result = -1;
		long leftsum = 0;
		for (int i = 0; i < n; i++) {

			sum = sum-arr[i];
			
			System.out.println("totalsum "+sum);
			System.out.println("leftsum -------- "+leftsum); 
			
			if (leftsum == sum) {
				result = i ;
				break;
			}
			
			leftsum = leftsum + arr[i];


		
		}
		
		System.out.println("reuslt "+result);
		return result;

	}

}
