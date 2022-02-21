package tuf.recursion;

import java.util.ArrayList;

public class SubSequence {

	// Refer TUF Recursion seq 6 
	public SubSequence() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr =  {0,1,2};
		//int [] arr2 = new int[4];
		
		printAllSubseq(arr,0,new ArrayList<Integer>());
		
		

	}
	
	
	public  static void printAllSubseq(int [] arr, int index , ArrayList<Integer> path) {
		
		
		
		if(index==arr.length) {
			
			// print element 
			
			if(path.size()>0)
				System.out.print(path.toString()+" , ");
			return;
		}
		
		/// call without including current
		printAllSubseq(arr,index+1,path);
		
		path.add(arr[index]);
		// call with including current element
		printAllSubseq(arr,index+1,path);
		
		path.remove(arr[path.size()-1]);
		
		
		
	}

}
