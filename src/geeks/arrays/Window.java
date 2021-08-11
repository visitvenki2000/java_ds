package geeks.arrays;


public class Window {

	public Window() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Window max = new Window();
		//int [] data = {1,8,30,-5,20,7};
		int [] data = {1,4,20,3,10,5};
		//max.maxSumConsecutive(data,3);
		
		System.out.println("---match sum is "+max.findMatchingSum(data,38));
	}
	public void maxSumConsecutive(int [] data,int k) {
		
		int sum=0;
		for(int i=0;i<k;i++) {
			sum = sum+data[i];
		}

		int max_sum =0;
		
		for(int i=k;i<data.length;i++) {
			
			sum = sum +data[i]-data[i-k];
			max_sum = Math.max(sum, max_sum);
		}
		
		System.out.println("---max sum is "+max_sum);
		
	}
	public boolean findMatchingSum(int [] data,int sum) {
		
		int cur_sum =data[0];
		int start =0;
		for(int e=1;e<data.length;e++) {
			
			// clear start index if cur sum is greater than sum
			
			while(cur_sum>sum && start <e-1)
			{
				cur_sum =cur_sum -data[start];
				start++;
			}
			
			if(cur_sum==sum)
				return true;
			else 
				cur_sum=cur_sum+data[e];
			
			
		}
		return cur_sum==sum; // Important for last item
	}
}
