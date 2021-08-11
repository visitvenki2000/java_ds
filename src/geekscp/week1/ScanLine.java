package geekscp.week1;

import java.util.Arrays;
import java.util.Scanner;

public class ScanLine {

	int test;
	public ScanLine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);		
		
		int N = sc.nextInt();
		int [] data = new int[N];
		
		for(int i=0;i<N;i++) {
			data[i]= sc.nextInt();
		}
		int [] scanLine = new int[N+1];
		for(int i=0;i<(N+1);i++) {
			scanLine[i]= 0;
		}
		int Q = sc.nextInt();
		
		while(Q>0) {
			
			int l = sc.nextInt();
			int r = sc.nextInt();
			int x = sc.nextInt();			
			scanLine[l]+=x;
			scanLine[r+1]-=x;		
			
			Q--;
		}
		int scan= 0;
		for(int i=0;i<N;i++) {
			scan+=scanLine[i];
			data[i]+=scan;
		}

		System.out.println("output:"+Arrays.toString(data));
	}
	
	

}
