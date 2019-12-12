package maths;

import java.util.Arrays;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prime pr = new Prime();
		
		
		pr.generatePrime2(20);
		/*
		for(int i=3;i<100;i++)
		System.out.println(i+"-"+pr.isPrime(i));
		*/

	}
	
	public boolean isPrime(long input) {
		
		boolean result =true;
		for (int i=2;i<(input-1);i++) {
			
			if(input%i==0)
				result=false;
		}
		
		
		return result;
	}
	
	// 6n-1 , 6n+1  not working for n=4
	public void generatePrime(long n) {
		
		
		for(int i=0;i<20;i++) {
			
			long p1 = 6*i+1;
			long p2 = 6*i-1;
			
			System.out.println(i+"-"+p1+"-"+p2);
		}
		
	}
	
	public void generatePrime2(int n) {
		
		int [] arr = new int[n] ;
		
		// fill array with values
		for(int i=0;i<n;i++) {
			arr[i]=i+1;
			}
		
		System.out.println(" Initial "+Arrays.toString(arr));
		for(int i=1;i<n;i++) {
			int temp = arr[i];
			//iterate with multiples of temp 
			if(temp!=0) {
				int j=2;
				while(temp*j<=n) {
					
					
					arr[temp*j-1]=0;
					j++;
				}
				
				System.out.println(" j is "+j+"-"+Arrays.toString(arr));
			}
			
			}
		System.out.println(" Final "+Arrays.toString(arr));
	}

}
