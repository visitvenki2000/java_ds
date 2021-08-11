package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseJava8 {
	
	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(
				new Person("Charles","Dickens",20),
				new Person("Lewis","Caroll",20),
				new Person("Thomas","Carlyle",20),
				new Person("Mathew","Arnold",20),
				new Person("Charlotte","Bornte",20));
			
		
		// 1) sort list by last name 
		//Collections.sort(list);
		
		
		Collections.sort(list,(p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
		
	//	Collections.sort(list,()->);
		
		Unit1ExerciseJava8 unit1 = new Unit1ExerciseJava8();
		unit1.print(list);
		System.out.println("----------------------");
		
		unit1.printlastNameStartsWithC(list, p1->p1.getLastName().startsWith("C"));
		System.out.println("----------------------");
		unit1.printConditionallyWithPredicate(list, p1->p1.getFirName().startsWith("C"));
		
		System.out.println("----------------------");
			unit1.printConditionallyWithPredicateConsumer(list, p1->p1.getFirName().startsWith("C"),p1->System.out.println(p1.getFirName()));
	
		System.out.println("----------------------");
		
	
		
		
		// Create method that prints all elements in list
		// Create method that prints all people last name that begins with C
		
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




public void printConditionallyWithPredicate(List<Person> list,Predicate<Person> c) {
	
	
	for(Person p:list) {
		
		if(c.test(p))
		System.out.println(p);
		
	}
	
}
public void printConditionallyWithPredicateConsumer(List<Person> list,Predicate<Person> pr,Consumer<Person> c) {
	
	
	for(Person p:list) {
		
		if(pr.test(p))
		c.accept(p);
		
	}
	
}

}

