package geeks.maths;


/*
 * Imp - for input 4,4,1 - integer devision gives 0 instead of 0.5 use double in denominator
 */
public class Qudratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int a =4, b=4, c=1;
	
    double den = b*b-4*a*c;
    
    System.out.print("den"+den);
    if(den<0)
    System.out.print("Imaginary");
    else if(den==0) {
    	
        double root1 = (-b)/(new Double(2*a));
        double root2 =(-b)/(new Double(2*a));
        System.out.print(" "+root1);
        System.out.print(" "+(int)Math.floor(root1));
        System.out.print(" "+(int)Math.floor(root2));

    }else {
    	
    	
    double root1 =(-b+Math.sqrt(den))/(new Double(2*a));
    double root2 =(-b-Math.sqrt(den))/(new Double(2*a));
    System.out.print(""+(int)Math.floor(root1));
    System.out.print(" "+(int)Math.floor(root2));

    }
	}

}
