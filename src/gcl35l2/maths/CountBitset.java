package gcl35l2.maths;

public class CountBitset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 15;
		int count  =0;
	
		while(a>0){
			
			
			if((a&(1))==1){
				count++;
			}
			a =a>>1;
			
		}
		//System.out.println(""+count);
		int b=15;
		while(a>0){
			b = b&(b-1);
			
		}
		System.out.println(""+count);

	}

}
