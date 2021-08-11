package maths;

public class CalcChit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amount;
		int incrementAmount;
		int total = 0;
		int interestTotal =0;
		amount = 3700;
		
		
		incrementAmount =70;
		
		for (int i = 0; i<20; i++)
		{
			amount = 3700 + i*incrementAmount;
			total = total +amount;
			
			int temp =(total*12*1)/(12*100);
			interestTotal = interestTotal + temp ;
			
			System.out.print("present amount  "+amount + " Total "+total);
			
			System.out.print(" temp  "+temp+"  Interest  "+interestTotal +"\n  " );
		}
		
		System.out.print("Final Amount  "+total );
		


	}

}
