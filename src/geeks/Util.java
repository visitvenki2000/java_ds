package geeks;

import java.time.LocalDate;

public class Util {

	public Util() {
		// TODO Auto-generated constructor stub
	}

	public static void print(int [] dataArray){
		
		
		//for(int i=0;i<dataArray.length;i++) 
		//System.out.print("-"+dataArray[i]);
	//	System.out.println("");
		
	
		
	}
	
	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2025, 3, 2);
		System.out.println(""+getDayOfWeek(2026,1,3));
	}
	
	public static int getDayOfWeek(int year, int month, int day) {
	    LocalDate date = LocalDate.of(year, month, day);
	    int dayIndex  = date.getDayOfWeek().getValue();
		System.out.println("dayIndex "+dayIndex);
	    return (dayIndex % 7) + 1;
	}
}
