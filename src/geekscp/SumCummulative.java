package geekscp;

import java.util.*;
import java.lang.*;

class SumCummulative
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] data = new int[N];
		for(int i=0;i<N;i++){
			int tmep = sc.nextInt();
			data[i]= tmep;
		}
		int []preSum = new int[N];
		preSum[0] = data[0];
		
			for(int i=1;i<N;i++){
			preSum[i]= preSum[i-1]+data[i];
		}
		
		int Q = sc.nextInt();
		
		while (Q>0){
				int i = sc.nextInt();
				int j = sc.nextInt();
				int sum  = 	preSum[j];
				if(i>0)
				sum= sum-preSum[i-1];
				System.out.println(sum);
				
			Q--;
		}
		sc.close();
		
	}
}

