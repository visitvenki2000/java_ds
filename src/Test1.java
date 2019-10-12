import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test1 {

	static final Integer i1=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("test");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String input1 = "";
String  input2 = "";
try {
	 input1 = br.readLine();
	 
	input2 = br.readLine();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}  

String[] currencies = input2.split(" ");
for(String s:currencies ) {
	
	System.out.println("loop "+s);
}

//System.out.println("input1 "+input1);
//System.out.println("input1 "+input2);
Scanner myObj = new Scanner(System.in);

 


int age = myObj.nextInt();
int age2 = myObj.nextInt();
System.out.println("----age "+age);
System.out.println("---- age2 "+age2+ "--"+myObj.nextLine());

int n1 = Integer.parseInt("4");

//System.out.println("testn1 "+n1);
/*
int b = 12;
if(b%3==0 && b%5==0)
	System.out.println("3 and 5");
else if(b%3==0 )
	System.out.println("3 ");

*/
class Inner {
	
	
}
	}

}
