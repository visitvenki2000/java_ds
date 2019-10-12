package java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LambdaSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>  employeeList = Arrays.asList(1,2,4,5,6);
		AtomicInteger  sum= new AtomicInteger (10);
		employeeList.forEach(i->  {
			System.out.println(sum);
			//sum =sum+i;
			sum.getAndIncrement();
			//System.out.println(sum);
			}
		);
		
		
		
		

	}

}
