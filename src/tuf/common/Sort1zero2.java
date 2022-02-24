package tuf.common;

import java.util.Arrays;

public class Sort1zero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {0,0,0,1,1,1,2,1,2,0,0,1};
		sortDutchNationalFlag(arr);

	}
	
	public static void sortDutchNationalFlag (int [] arr){
		
		int low =0;
		int mid =0;
		int high = arr.length-1;
		
		
		while(mid<=high) {
			
			if(arr[mid]==0){
				//swap with low 
				int temp = arr[low];
				arr[low] =arr[mid];
				arr[mid] = temp ;
				low++;
				mid++;
			}else if(arr[mid]==2){
				//swap with low 
				int temp = arr[high];
				arr[high] =arr[mid];
				arr[mid] = temp ;
				high--;
			
			} else 	if(arr[mid]==1)
				mid++;	
			System.out.println("loop ---"+Arrays.toString(arr));	
			
			System.out.println("low "+low+" mid "+mid+"--high "+high);
	
		}
		System.out.println("output"+Arrays.toString(arr));
		
		
	}

}
