package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Exercise {
	
	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(
				new Person("Charles","Dickens",20),
				new Person("Lewis","Caroll",20),
				new Person("Thomas","Carlyle",20),
				new Person("Mathew","Arnold",20),
				new Person("Charlotte","Bornte",20));
			
		
		// 1) sort list by last name 
		//Collections.sort(list);
		
		
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
	//	Collections.sort(list,()->);
		
		Unit1Exercise unit1 = new Unit1Exercise();
		unit1.print(list);
		System.out.println("----------------------");
		unit1.printlastNameStartsWithC(list, new Condition() {

			@Override
			public boolean test(Person p1) {
				// TODO Auto-generated method stub
				return p1.getLastName().startsWith("C");
			}
			
		});
		System.out.println("----------------------");
		
		unit1.printlastNameStartsWithC(list, new Condition() {

			@Override
			public boolean test(Person p1) {
				// TODO Auto-generated method stub
				return p1.getFirName().startsWith("C");
			}
			
		});
		
		
		// Create method that prints all elements in list
		// Create method that prints all people last name that begins with C
		
	}
	
	public void sortdata(	List<Person> list ) {
		
		
	}
	
	public void print(List<Person> list) {
		
		
		for(Person p:list)
			System.out.println(p);
		
	}
	
public void printlastNameStartsWithC(List<Person> list,Condition c) {
		
		
		for(Person p:list) {
			
			if(c.test(p))
			System.out.println(p);
			
		}
		
	}







}

interface Condition {
	
	public boolean test(Person p1);
}
