package gcl35l2.maths.list;

import java.util.Arrays;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {5,1,2,3};
		nexGr(arr);
		
	}
	
	public static void nexGr(int[] arr){
		
		int[] output = new int[arr.length];
		Arrays.fill(output, -1);
		
		for(int i=0;i<arr.length;i++){
			
			
			for(int j=i;j<arr.length;j++){
				
				if(arr[j]>arr[i]){
					output[i]=arr[j];
					break;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(output));
	}

}
