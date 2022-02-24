package gcl35l2.recurs;

import java.util.*;
/* print all subseqeunces
 * 1) take temporary array
 * 2) add to list number ....and proceed with recursion with next index
 * 3) remove number
 * 4) proceed with recursion after remving added number with next index....
 *  */
public class Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3};
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		sub(arr,0,arr.length,list, new ArrayList<Integer>());
	}

	public static void sub(int [] arr,int x,int n,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> ans){

		if(x>=n) {
			System.out.println(" List elemeents "+ans.toString());
			//todo add to master list
			return;			
		}
		
		ans.add(arr[x]);
		sub(arr,x+1,n,list,ans);		
		//// important ....removing  arr[x] is giving wrong result ...as taking as index
		ans.remove(ans.size()-1);

		sub(arr,x+1,n,list,ans);
	
	}

}
