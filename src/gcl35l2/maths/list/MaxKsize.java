package gcl35l2.maths.list;

import java.util.Arrays;

public class MaxKsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] data= {1,2,3,1,4,5,2};
		
		System.out.println(Arrays.toString(findMax(data,3)));
	}

	public   static int[] findMax(int[] data, int k){
		int[] result = new int[data.length-k];
		
		for(int i=0;i<data.length-k;i++){
			
			int max=0;
			for(int j=i;j<i+k;j++){
				
				max = Math.max(max, data[j]);
			}
			result[i] =max;
			
		}
		
		
		return result;
		
	}
}
