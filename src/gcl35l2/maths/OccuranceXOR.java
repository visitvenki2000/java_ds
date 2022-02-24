package gcl35l2.maths;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class OccuranceXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr ={12,4,5,5,4,13,12};
		System.out.println(find3(arr)+"");
		
	}
	public static int findNumber(int[] arr){
		
		int result =0;
		Arrays.sort(arr);
		boolean found =false;
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i]!=arr[i+1]) {
				result =arr[i];
				found=true;
				break;
			}
			i++;
		}
		
		if(arr.length%2!=0 && !found){
			
			//odd number 
			result =arr[arr.length-1];
			
		}
		
		
		return result;
	}
public static int findNumber2(int[] arr){
		
		int result =0;
		//Arrays.sort(arr);
		boolean found =false;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++){
			if(map.get(arr[i])==null) 		  
				map.put(arr[i], 1);
			else 
				map.put(arr[i], map.get(arr[i])+1);
		}
		
	
		for(Entry<Integer, Integer> temp: map.entrySet()){
			
			System.out.println("--key "+temp.getKey());
			
			System.out.println("--value  "+temp.getValue());
			
			if(temp.getValue()%2!=0){
				
				result =temp.getKey();
				break;
			}
			
			
		}
		
		
		return result;
	}
public static int find3(int [] arr){
	
	int xor = 0;
	for(int i=0;i<arr.length;i++){
		xor = xor^arr[i];
	}
	return xor;
}
}
