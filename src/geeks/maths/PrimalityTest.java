package geeks.maths;

public class PrimalityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(""+isPrime(4));
	}
	
	 public static boolean isPrime(int N)
	    {
	         //Your code here
	    if(N<2)
	    return false;
	    
	    if(N==2)
	    return true;
	    
	     boolean isPrime =true;
	     for(int i=2;i<N;i++){
	         
	         if(N% i==0) {
	         isPrime=false;
	         break;
	         }
	     }
	     
	     return isPrime;
	    }

}
