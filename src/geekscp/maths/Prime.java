package geekscp.maths;

public class Prime {

	long size = 10000000000l;
	long [] data2 = new long [(int) size];// 10**9 int long
	public Prime() {
		// TODO Auto-generated constructor stub
	}

	boolean [] sieve = new boolean[1000+1];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//countFactors(45);
		
		int [][] data = new int [10000][10000];
		//data[0] =1;
		System.out.println("size "+data[0].length);	
		//countFactors(41);
		//countFactors(113);
		Prime pm = new Prime();
		pm.createSieve();
		

	}
	
	static int countFactors(int input) {
		
		int count=0;
		
		for(int i=1;i*i<input;i++) {
			
			if(input%i==0) {
				System.out.println("Factor "+i);	
				System.out.println("Factor "+input/i);
				
			}
		}
		
		if(count==0)
		{
			System.out.println(input+" is Prime");
		}
		
		return count;
	}
	
	public void createSieve() {

		int n = sieve.length-1;

		for (int i = 0; i < n; i++) {
			sieve[i] = true;
		}

		for (int i = 2; i * i <= n; i++) {

			if (sieve[i] == true) {
			for (int j = 2 * i; j <= n; j =j+i) {

				

					sieve[j] = false;
				}
			}

		}
		for (int i = 2; i < n; i++) {
			
			if(sieve[i] == true)
			System.out.println(i+" ");
		}

}
	

}
