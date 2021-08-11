package java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LambdaSample {

	//Task 1 if any match set to true...
	//Task 2: if any match object of that row assign ref...?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>  employeeList = Arrays.asList(1,2,4,5,6);
		AtomicInteger  sum= new AtomicInteger (10);
		 boolean  test =false;
		 Integer temp = null;
		employeeList.forEach(i->  {
			System.out.println(sum);
			//sum =sum+i;
			//test =i;
		
			sum.getAndIncrement();
			//System.out.println(sum);
			}
		);
		test = employeeList.stream().anyMatch(i->i==4);
		
		
		System.out.println("test " + test);
		
		
		
		
		

	}

}
