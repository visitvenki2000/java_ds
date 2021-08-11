package sort;

import java.util.Arrays;



public class InsertionSort {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InsertionSort insert = new InsertionSort();
		int [] data = {5,3,20,15,6,8,9};
		insert.sort(data);
		
	}
	
	/*
	 * 
	 * Start from index 1 .... Travel left side ..insert selected Element at appropriate position 
	 * 
	 */
	public void sort(int [] data ) {
		
		
		for( int i=1;i<data.length;i++) {
			int k = data[i];
			int j= i-1;
			while(j>=0 && data[j]>k) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1]=k;
		
		}
		System.out.println("--"+Arrays.toString(data));	
	}

}
