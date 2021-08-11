package geeks.maths;

public class DigitsFactorial {
	public static double M_E = 2.71828182845904523536; 
    public static double M_PI = 3.141592654;
	
	// ** impt f(x) = n* log10(( n/ e)) + log10(2*pi*n)/2   Kamenetsky  formulae
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(digitsInFactorial(120));
		System.out.println(digitsInFactorial2(120));
	}
	
	   public static int digitsInFactorial(int N)
	    {
	        //Your code here
	        
	           double  fact= N*Math.log10(N/M_E)+Math.log10(2*M_PI*N)/2.0;
	    
	           int count  = (int)Math.floor(fact)+1;

		
	    return count;  
	    }
// method 2	 simple .... 
	   public static int digitsInFactorial2(int N)
	    {
	           double  fact= 0;
	           
	           for(int i=N;i>0;i--)
	        	   fact = Math.log10(i)+fact;
	    
	           int count  = (int)Math.floor(fact)+1;
		
	    return count;  
	    }
	 

}
