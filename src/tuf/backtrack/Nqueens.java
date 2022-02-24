package tuf.backtrack;

import java.util.ArrayList;
import java.util.List;

//Step 1: start with column keep on checking new column
// check for each row in for loop row 0>n-1 if can be filled
public class Nqueens {

	public Nqueens() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<String>> res =	nQueen(4);
		
		System.out.println("res "+res);

	}
	public static List<List<String>>  nQueen(int n){
		List<List<String>> ans = new ArrayList<List<String>>();
		
		char[][] board = new char[n][n];
		
		for(int i=0;i<n;i++) {
			//System.out.println("i "+i);
			for( int j=0;j<n;j++) {
				
				board[i][j]='.';
			}
			}
					
		nQrecur(0,board,ans,n);
		
		return ans;
		
	}
	
	
	public static void nQrecur(int col, char[][] board, List<List<String>> ans,int n) {
		
		if(col==n) {
			// copy answer
			List<String> list = new ArrayList<String>();
			
			for(int i=0;i<n;i++) {
				String s ="";
				for( int j=0;j<n;j++)
					s =s + board[i][j];
				list.add(s);
				
			}
			ans.add(list);
			return;
			
			
		}
		// check for all rows 
		for(int i=0;i<n;i++) {
			if(isValid(board,i,col)) {
				board[i][col]='Q';
				nQrecur(col+1,board,ans,n);
				board[i][col]='.';
			}
			
		}
	}
public static boolean isValid(char[][] board,int row ,int col) {
		
		// check in same row 
		// check in same column
		boolean result =true;
		//
		int tempRow = row;
		int tempCol = col;
		//check diagnol 
		while(tempRow>=0 && tempCol>=0) {
			if(board[tempRow][tempCol]=='Q' )return false;
		
			tempRow--;
			tempCol--;
		}
		
		 tempRow = row;
		 tempCol = col;
		//check colomn 
		while(tempRow>=0 && tempCol>=0) {
			if(board[tempRow][tempCol]=='Q' )return false;
			tempCol--;
		
		}
		
		
		 tempRow = row;
		 tempCol = col;
		//check lower left diagnol 
		while(tempCol>=0 && tempRow<board.length) {
			if(board[tempRow][tempCol]=='Q' )return false;
			tempCol--;
			tempRow++;
		
		}
		return result;
	}

}
