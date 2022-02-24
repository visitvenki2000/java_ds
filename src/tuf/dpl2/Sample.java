package tuf.dpl2;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] a =new boolean [5];
		
		int [] A = {1, 3, 6, 4, 1, 2};
		  Arrays.sort(A);
		  System.out.println(Arrays.toString(A));
		  int min =0;

		  for(int i=0;i<A.length;i++){
			  if(A[i]<0)
				  continue;
			  if(i==0){
				  if(A[i]==1)
					  continue;
					  else {
						  min=1;  
						  break;
						  }
			  }else {
				  if(A[i]==A[i-1]) 
					  continue;
				  
				  if(A[i]!=A[i-1]+1) {
					  min =A[i-1]+1;
					  break;
				  }
					  
			  }
	         
	        }
		  System.out.println(min);
		  
		  
	}

}
