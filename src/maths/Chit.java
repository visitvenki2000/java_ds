package maths;

public class Chit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double  principalInitial= 6800;//3400 ;
		double rate = 14;
	 ///
		double principalTotal = 0;
		
		double totalInterest = 0;
		 
		 for(int i=0;i<25;i++) {
			 
			 principalTotal = principalTotal+principalInitial;
			 double interest = principalTotal*1*rate/100; // per year 
			 double interestMonth =interest/12;
			// System.out.println("interest "+interest);
			 System.out.println("interestMonth "+interestMonth);
			 System.out.println("principalTotal "+principalTotal);
			 
			 totalInterest = totalInterest+interestMonth;
			 
			 principalTotal = principalTotal+interestMonth; // if cummulative interest
			 
			 // increment principal 
	
			 
			 System.out.println("totalInterest "+totalInterest);
	
			 System.out.println("------------------------------------");
			 
			 
		 }
		 
		 
		 
		 System.out.println("Final totalInterest "+totalInterest);
		 System.out.println(" final principalTotal "+principalTotal);
		 
		// calInterest();
		 
		
	}
	
	public static void calInterest() {
		
		int rate =20;
		 double interest = 70000*1*rate/100; // per year 
		 double interestMonth =interest/12;
		// System.out.println("interest "+interest);
		 System.out.println("interestMonth "+interestMonth);
		 System.out.println("interestMonth "+interestMonth*25);
		 
		 // with 12 % interest rate 17,500 
		 // 15 % interest rate 
		 // 20 % interest rate 29166 rs - 
		
	}
// Final totalInterest 29466.666666666668
	/// final principalTotal 170000.0  close to 2L 
}
// 30k from first 
// 27k 
// 
/*
 30 *5
 28500
 27000
 
 
 
 
 
 * 
 * 
 * 
 */
