package geeks.maths;

public class Sqrt {

	public Sqrt() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=37;
	
		printSqrt(n);

	}
	
	public static void printSqrt(int n) {
		int res =0;
		for (int i=0;i<n;i++) {
		 if(i*i <=n)
		 res = i;
		}
		System.out.println(""+res);
		
		
	}

}
