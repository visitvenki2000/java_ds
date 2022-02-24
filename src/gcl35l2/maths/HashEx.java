package gcl35l2.maths;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {10,10,2,3,3,4};
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++){
			
			if(map.get(arr[i])!=null){
				int value = map.get(arr[i])+1;
				map.put(arr[i], value);		
				System.out.println("updated"+arr[i]+"--"+value);
			}else {
				map.put(arr[i], 1);				
			}
			
		}
		
		
	
			Iterator<Entry<Integer,Integer>> it = map.entrySet().iterator();
		
			while(it.hasNext()){
				Entry<Integer,Integer> entry = it.next();
				if(entry.getValue()==1)
					System.out.println(entry.getKey());
			}
				
				
			
		
		
	}

}
