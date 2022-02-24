package geekscp;
import java.util.*;
import java.lang.*;
// submitted exlcude package  
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
				Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] arr = new int[N];

		// calculate prfix sum 
		for(int i=0;i<N;i++)
		{
			int temp = sc.nextInt();
			arr[i]=temp;
		}
		//System.out.println(Arrays.toString(arr));
		int [] preSum  = new int[N];
		
		preSum[0] =arr[0];
		for(int i=1;i<N;i++){
			
			preSum[i] =preSum [i-1]+arr[i];
			
		}
		//System.out.println(Arrays.toString(preSum));
		int Q = sc.nextInt();
		while (Q>0){
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			int sum  = preSum[j];
			if(i>0)
			sum= sum-preSum[i-1];
			System.out.println(sum);
			Q--;
		}
		
		sc.close();
		
	}
}