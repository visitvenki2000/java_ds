package java8;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> list = Arrays.asList(
				new Person("Charles","Dickens",20),
				new Person("Lewis","Caroll",30),
				new Person("Thomas","Carlyle",40),
				new Person("Mathew","Arnold",50),
				new Person("Charlotte","Bornte",60));
		Person test = new Person("test","test2",35);
		
		
		for(Person p:list) {
			
			System.out.println(""+p);
			
		}
		System.out.println("-----------------");
		
		list.forEach(p->System.out.println(p));
		
	System.out.println("-----------------");
		
		list.forEach(System.out::println);
		
		List<Person> list2 = new ArrayList<Person>();
		
	System.out.println("-----------------List2 ");
		
		list.forEach(p->{
			if(p.getAge()>test.getAge())
			list2.add(new Person(p.getLastName(),p.getFirName(),p.getAge()));
			p.setAge(40);
			
		});
		
		list2.forEach(System.out::println);
		
		System.out.println("-----------------Streams ");
		
		list2.stream().filter(p->p.getFirName().startsWith("C")).forEach(System.out::println);
		
		System.out.println("-----------------Streams 2");
		list2.parallelStream().filter(p->p.getFirName().startsWith("C")).forEach(System.out::println);
	}

}
