package geeks.maths;

public class GP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(termOfGP(84,87,3));
	}
	
    public static double termOfGP(int A,int B,int N)
    {
   double r = B/new Double(A);  ///*** imp use double in denominator other wise loose prcesion 
    
    double nTerm = A*Math.pow(r,N-1);
    
    return Math.floor(nTerm);
    }

}
