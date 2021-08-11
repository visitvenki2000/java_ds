package geeks.search;

import java.util.HashSet;

public class TwoPointerApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoPointerApproach tp = new TwoPointerApproach();
		
		int [] data = {1,2,3,6,7,9,12,20,25};
		
		System.out.println("--Has Pair+"+tp.printPairTwoPointer(data, 18));
		System.out.println("--Has Pair+"+tp.printPairHash(data, 20));
		
		
	}
	/*
	 * Print pair with two pointer approach . With matching given sum of two numbers 
	 */
	public boolean printPairTwoPointer(int [] data ,int sum) {
		
		int low =0, high =data.length-1;
		while (low<high) {
			if((data[low]+data[high])==sum) {
				System.out.println("Found elements "+data[low]+"-"+data[high]);
				return true;
			}else if(data[low]+data[high]>sum) 
				high--;// decrease high pointer in case sum of two more than given sum 
			else 
				low++; // increase low pointer in case sum of two less than given sum
		}
		return false;
	}

	
	public boolean printPairHash(int[] data,int sum) {

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(data[0]);
		for(int i=1;i<data.length-1;i++) {
			
			// 
			if(set.contains(sum-data[i])) {
				System.out.println("With hash - Found Elements"+data[i]+"-"+(sum-data[i]));
			return true;
			}
			set.add(data[i]);
			
		}
		
		return false;
	}
	
}
