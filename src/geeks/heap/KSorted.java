package geeks.heap;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class KSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] data ={10,9,7,8,4,70,50,60};
			//{9,8,7,18,19,17};
		// {9,8,7,18,19,17,1,2,3}; nor working ? 
		sort(data,data.length,4);
		
	}
	// 
	public static void sort(int [] arr, int n, int k) {
		
		
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
		
		for(int i=0;i<=k;i++)
			pQ.add(arr[i]);
		int index= 0;
		for(int i=k+1;i<n;i++) {
			
			arr[index++] = pQ.poll();
			pQ.add(arr[i]);
		}
		
		while (pQ.isEmpty()==false) {
			
			arr[index++]= pQ.poll();
		}
		
		
	
	 	System.out.println("sorted:"+Arrays.toString(arr));
	}
	
	public static void kSort(int[] arr, int n, int k)  
    { 
  
        // min heap 
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); 
  
        // add first k + 1 items to the min heap 
        for(int i = 0; i < k + 1; i++) 
        { 
            priorityQueue.add(arr[i]); 
        } 
  
        int index = 0; 
        for(int i = k + 1; i < n; i++)  
        { 
            arr[index++] = priorityQueue.peek(); 
            priorityQueue.poll(); 
            priorityQueue.add(arr[i]); 
        } 
  
        Iterator<Integer> itr = priorityQueue.iterator(); 
  
        while(itr.hasNext())  
        { 
            arr[index++] = priorityQueue.peek(); 
            priorityQueue.poll(); 
        } 
        
    	System.out.println("sorted:"+Arrays.toString(arr));
  
    } 

}
