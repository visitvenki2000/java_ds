package geeks;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	int[][] A = {{1,2},
				     {3,4}};
		
		int [][] B ={{1,2},
				     {3,4}};
				     */
		
		
		int[][] A = {{1,2,3},
			     {3,4,5}};
	
	int [][] B ={{1,2},
			     {3,4},
			     {5,6}};
		
		int [][] C= new int[A.length][B[0].length];
		
		for (int i=0;i<A.length;i++) {
			
			
			for (int j=0;j<B[0].length;j++) {
				C[i][j]=0;
				for (int k=0;k<B.length;k++) {	
			C[i][j]+= A[i][k]* B[k][j];
				}
     //System.out.println(" "+i+"-"+j+"- "+C[i][j]);
				   System.out.print(C[i][j]+" ");

			}
			 System.out.print("\n");
		}
		
		
	}

}
