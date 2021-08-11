package geeks.bitwise;

public class CountBitsLookup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CountBitsLookup lookup = new	CountBitsLookup();
		lookup.count(33);
	}
	
	int []arr ;
	
	public CountBitsLookup() {
		
		arr =  new int[256];
		arr[0]=0;
		for(int i=1;i<256;i++)
			arr[i]=(i&1)+arr[i/2];
		
	}
	
	public void count(int n) {
		
		int count=0;
		count = arr[n&0xFF]; // last8 bits 
		n=n>>8; //right shift last 8 bits
		count = count + arr[n&0xFF];
		n=n>>8;
		count = count + arr[n&0xFF];
		n=n>>8;
		count = count + arr[n&0xFF];
		
		System.out.println(count);
		
	}

}
