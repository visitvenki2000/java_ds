package geeks.matrix;

import java.util.Arrays;

public class JaggedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//createJagged();
		
		int[][] mat = fillData(new int[4][4]);
		
		print(mat);
		//printSnake(mat);
		System.out.println(" Spider  " );
		spider(mat);
	
		
		
	}
	
	public static void spider(int[][] arr) {
		int R = arr.length;
		int C = arr[0].length;
		
		int rStart =0;
		int cStart =0;
		int rMax =R-1;
		int cMax = C-1;
		
		
		while (cStart<cMax) {
	     // Step 1 ; 
			for (int j = cStart; j <=cMax; j++) {	
				System.out.print(" "+arr[rStart][j] );
				}
			
			
		     // Step 2 ; 
					for (int i =rStart+1 ; i <=rMax; i++) {	
						System.out.print(" "+arr[i][cMax] );
						}
			
		     // Step 3 ; 
					for (int j = rMax-1; j >=cStart; j--) {	
						System.out.print(" "+arr[cMax][j] );
						}
		

				     // Step 4 ; 
								for (int i =rMax-1 ; i >=rStart+1; i--) {	
									System.out.print(" "+arr[i][cStart] );
									}
								
								
								 rStart =rStart+1;
								 cStart =cStart+1;
								 rMax =rMax-1;;
								 cMax =cMax-1;
								
								
		}
								
								
		
	}
	public static void rotate90Naive(int[][] arr) {
		int R = arr.length;
		int C = arr[0].length;
		
		int[][] temp = new int[R][C];
		
		
		for (int j =C-1 ; j >=0; j--) {

			for (int i = 0; i < R; i++) {

			
				temp[C-j-1][i] =  arr[i][j];
			
				}
			}
		System.out.println(" Rotated by 90 navie  " );
		print(temp);
		
	}
		
		
	
	public static void transponse(int[][] arr) {
		
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if(j>i) {
				int temp = arr[i][j] ;
				arr[i][j] =  arr[j][i];
				arr[j][i] = temp;
				}
			}
		}
		print(arr);
		
	}

	public static void printBoundary(int[][] arr) {

		int m = arr.length;
		int n = arr[0].length;

		if (m == 1) { //  handle if single row 
			
			for (int i = 0; i < n; i++) {
				System.out.print(" " + arr[0][i]);
			}

		} else if (n == 1) { // handle if single column
			
			for (int i = 0; i < m; i++) {
				System.out.print(" " + arr[i][0]);
			}

		} else {

			for (int i = 0; i < m; i++) {
				System.out.print(" " + arr[0][i]);
			}
			for (int i = 1; i < n; i++) {
				System.out.print(" " + arr[i][m - 1]);
			}

			for (int i = m - 2; i >= 0; i--) {
				System.out.print(" " + arr[m - 1][i]);
			}

			for (int i = n - 2; i > 0; i--) {
				System.out.print(" " + arr[i][0]);
			}

		}
	}
	
	public static void printSnake(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {

					System.out.print(" " + arr[i][j]);
				}
				System.out.println(" ");
			} else {

				for (int j =  arr[i].length-1; j >=0; j--) {

					System.out.print(" " + arr[i][j]);
				}
				System.out.println(" ");
			}
		}
	}

	public static void print(int [][] arr) {
		
		for (int i = 0; i < arr.length; i++) {

			System.out.println(Arrays.toString(arr[i]));
		}
	}

	public static int[][] fillData(int[][] arr) {
		int k = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = k++;
			}
		}

		return arr;
	}
	
	
	public static void createJagged() {

		int[][] matA = new int[3][];

		for (int i = 0; i < matA.length; i++) {

			matA[i] = new int[i + 1];

			for (int j = 0; j < matA[i].length; j++) {

				matA[i][j] = i;
			}

		}

		for (int i = 0; i < matA.length; i++) {

			for (int j = 0; j < matA[i].length; j++) {

				//System.out.print(" " + matA[i][j]);
			}
			//System.out.println(" ");
			System.out.println(Arrays.toString(matA[i]));
		}

		//System.out.println(Arrays.toString(matA));
	}
	

	
}
