package tuf.placement;

import java.util.*;
/* Leet Code */
public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {-1,0,1,2,-1,-4};
		
		List<List<Integer>> result = threeSum(arr);
		System.out.println("--"+result.size());
		System.out.println(result.toString());

	}
	
	
public static List<List<Integer>> threeSum(int[] nums) {
        
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
		System.out.println("--"+nums);
        
        for(int i=0;i<nums.length-2;i++){
            
            if(i==0|| (i>0 && nums[i]!=nums[i-1])){
                
                int sum = 0-nums[i];
                int lo = i+1;
                int hi = nums.length-1;
                while(lo<hi){
                    
                    
                    if(sum==(nums[lo]+nums[hi])){
                    	
                		System.out.println("matching -"+lo);
                        
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[lo]);
                        list.add(nums[hi]);
                        ans.add(list);
                        
                        while(lo<hi && nums[lo]==nums[lo+1])lo ++;
                        
                        while(lo<hi && nums[hi]==nums[hi-1])hi--;
                        lo++;
                        hi--;
                        
                        
                    }else if(sum>nums[lo]+nums[hi])
                    	lo++;
                    else hi--;
                    
                    
                    
                } //while
                
                
                
            } //if
            
        } //for
        return ans;
        
    }

}
