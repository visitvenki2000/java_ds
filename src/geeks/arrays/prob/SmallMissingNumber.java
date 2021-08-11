package geeks.arrays.prob;

import java.util.Arrays;

public class SmallMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-47,1,4,49,-18,10,26,18,-11,-38,-24,36,44,-11,45,20,-16,28,17,-49,47,-48,-33,42,2,6,-49,30,36,-9,15,39,-6,-31,-10,-21,-19,-33,47,21,31,25,-41,-23,17,6,47,3,36,15,-44,33,-31,-26,-22,21,-18,-21,-47,-31,20,18,-42,-35,-10,-1,46,-27,-32,-5,-4,1,-29,5,29,38,14,-22,-9,0,43,-50,-16,14,-26 };
 
				//{25,31,6,-50,-21,1,-8,-16,-1,10,-49,14,14,-7,22,5,-39,-17,-8,6,-10,46,9,-14,8,-40,-22,-4,47,25,44,-26,6,0,-25,35,3,-31,21,5,30,-26,-31,46,17,-6,-47,-20,-21 };
			//{37 ,6 ,-7 ,41, -23 ,15, 9, -14 ,-18, 1 ,-13 ,-22, 25, -43, 24 };
		//{19 ,48, -47 ,37, 20, -43 ,-39, 19, -24};
		//{24, 26 ,5,6,-46 ,-31,  -4, -20,  -11};
				//{0,-10,1,3,-20};
		//{19 ,48, -47 ,37, 20, -43 ,-39, 19, -24};
		
		Missing miss = new Missing();
		System.out.println(miss.missingNumber(arr, arr.length));
	}

}


class Missing{
    
    // function to find first positive missing number
    static int missingNumber(int arr[], int size)
    {
        
        // Your code here
        // You can add utility functions (if required)
    	int result =1;
    	// partision array  - hoare partician 
    	
    	int k =-1;
    	int j = size;
    	
		while (true) {
			do {
				k++;
			} while (arr[k] >= 0);// inclde 0 in left side

			//System.out.println("------k-"+k);
			
			do {
				j--;
				//System.out.println("------j-"+j);
			} while (arr[j] < 0);

			if ((k < j)) {
				// swap
				int temp = arr[k];
				arr[k] = arr[j];
				arr[j] = temp;
				//System.out.println("------swap-");
			} else {
				//System.out.println("------break-");
				break;
				
			}
		} // j contains last index of +ve elements 
		System.out.println(Arrays.toString(arr));
		System.out.println("-------");
		System.out.println("------k-"+k);
		//System.out.println("------j-"+j);
		
		 
		 
        
    	
    	int count = k; //segregate(arr,size);
    	
    	System.out.println(Arrays.toString(arr));
		System.out.println("-------count "+count);
    	
       /* for(int i=0;i<size;i++){
        	 if(arr[i] >0 )
        		 count++;
        	
        } */
        for(int i=0;i<count;i++){
            int temp = Math.abs(arr[i]);
    		System.out.println("-------temp "+temp);
            if(temp <=0 || temp >count) {
            //arr[i] = -1; ignore
            }
            else {           
        		System.out.println("-------temp else  "+temp);
            	if(arr[temp-1]>0) // if already -ve ignore  otherwise becomes +ve again 
                arr[temp-1] =-1*arr[temp-1];
            }
            
        }
        

        
        
		System.out.println(Arrays.toString(arr));
            for(int i=0;i<count;i++){
                
                int temp = arr[i];
                if(temp>0) {
                	result= i+1;  // add +1 to index 
                break;	
                }
                
            }
            return result;
        
    }
    

    /* Utility function that puts all non-positive  
       (0 and negative) numbers on left side of  
       arr[] and return count of such numbers */
    static int segregate(int arr[], int size) 
    { 
        int j = 0, i; 
        for (i = 0; i < size; i++) { 
            if (arr[i] <= 0) { 
                int temp; 
                temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
                // increment count of non-positive 
                // integers 
                j++; 
            } 
        } 
  
        return j; 
    } 
    
}