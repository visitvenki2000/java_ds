package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CountFreq {

	int count ;
	public int getCount() {
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ]data =  {10,4,5,10,4,6,5,8};
		CountFreq freq = new CountFreq();
		freq.countFrequnecy(data);
		
		int [ ]data2 =  {10,12,13,5,13,8};
		freq.countIntersection(data, data2);
		System.out.println("count "+Integer.toString(freq.getCount()));

	}
	
	public void countFrequnecy(int [] data) {
		

		
		HashMap<Integer, Integer> dataMap = new HashMap<>();
		
		Arrays.stream(data).forEach(i-> {
			
			System.out.println(i) ;
			if(dataMap.containsKey(i)) {
			int count  = dataMap.get(i);
					dataMap.put(i, count+1);
				
			}else {
				dataMap.put(i, 1);
			}
			
		});
		
		dataMap.forEach((k,v)-> {	
			System.out.println(""+k+"-"+v);
		}
		);
		
	
	
		
		
	}

	public void countIntersection(int [] dataA, int [] dataB) {
		
		
		HashSet<Integer> set = new HashSet<>();
		//final  Integer count =0;
			
			Arrays.stream(dataA).forEach(i->{
				
				set.add(i);
			});
			
			Arrays.stream(dataB).forEach(i->{
				if(set.contains(i)) {
					count++;
					set.remove(i);
					
				}
				
			});
			
		
		
	}
	
	

}
