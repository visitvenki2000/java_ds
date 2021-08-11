package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PairwithSumOthers {

	int count ;
	public int getCount() {
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ]data =  {10,4,5,10,4,6,5,8};
		PairwithSumOthers freq = new PairwithSumOthers();

		
		int [ ]data2 =  {10,2,13,5,13,7};
		
		System.out.println(freq.findPair(data2, 25));
		

	}
	
	public boolean  findPair(int [] data, int sum) {
		
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<data.length;i++)
		{
			
			if(set.contains(sum-data[i])) {
				return true;
			}
			
			set.add(data[i]);
		}
		
		return false;
		
	}
	
	
	

}
