package gcl35l1.dp;

import java.util.ArrayList;

public class Subseq {

	static int max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {7,6,1,7,8,10};
		ArrayList<Integer> sub = new ArrayList<Integer>();
		
		ArrayList<ArrayList<Integer>> allsub = new ArrayList<ArrayList<Integer>>();
		//subseq(arr,0,sub,allsub);
		
		System.out.println("------ max "+max);
		
		System.out.println("------ "+subset(arr,0,sub,18));
		
		
	}
	
	public static void subseq(int [] arr,int i,ArrayList<Integer> sub,ArrayList<ArrayList<Integer>> allsub){
		
		if(i==arr.length)
		{			// print sub seq 
			allsub.add(sub);
			System.out.println("------");
			int prev=0;
			int count=0;
			boolean flag =true;
			for(Integer temp: sub){
				if(count!=0)
				{
					if(temp<=prev)
						flag=false;			
		
				}
				count++;
				prev =temp;

			}
			if(flag){
				
				max= Math.max(max,sub.size());
				System.out.println("------max ");
				for(Integer temp: sub){
					System.out.print(" "+temp );
				}
			}
			System.out.println("------");
			return;			
		}		
		subseq(arr,i+1,sub,allsub);
		sub.add(arr[i]);
		subseq(arr,i+1,sub,allsub);
		sub.remove(sub.size()-1);
	}
	
public static boolean subset(int [] arr,int i,ArrayList<Integer> sub,int sum){
		
		if(i==arr.length)
		{			// print sub seq 
			//allsub.add(sub);
			System.out.println("------");
			int tempsum=0;
			boolean flag = false;
	
			for(Integer temp: sub){
			
				
				tempsum = tempsum+temp;

			}
			if(tempsum==sum){
				
				
				System.out.println("found sum ------ "+tempsum);
				flag=true;
			
			}
			System.out.println("------");
			return flag;			
		}		
		boolean result = subset(arr,i+1,sub,sum);
	
		if(!result) {
			sub.add(arr[i]);
		result =  subset(arr,i+1,sub,sum);
		sub.remove(sub.size()-1);
		}
		return result;
	}

}
