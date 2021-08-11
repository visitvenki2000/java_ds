package geeks.driver;

import java.util.Scanner;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		int T = sc.nextInt();
		while(T!=0) {
			
			
			System.out.println("Enter :");
			
			int a =sc.nextInt();
			
			int b = sc.nextInt();
			
			System.out.println("a :"+a);

			System.out.println("b :"+b);
			T--;
		}
		

	}

}
