package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamSample {

	
	//Task 1 if any match set to true...
	//Task 2: if any match object of that row assign ref...?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list =getPersonList();
		Person test = new Person("test","test2",35);
		
		 boolean  isMatch =false;
		 Integer temp = null;
		 
			
			//Task 1 if any match set to true...
		 isMatch = list.stream().anyMatch(p->p.getAge()==40);
		 
			//Task 2: if any match object of that return that object.....?
		 
		 Optional<Person> resultPerson = list.stream().filter(p->p.getAge()==90).findAny();
		 
		 if(resultPerson.isPresent())
		 {
			 System.out.println("Found person "+resultPerson.get().firName);
		 }

	}
	
	
	public static List<Person>  getPersonList () {
		
		
		List<Person> list = Arrays.asList(
				new Person("Charles","Dickens",20),
				new Person("Lewis","Caroll",30),
				new Person("Thomas","Carlyle",40),
				new Person("Mathew","Arnold",50),
				new Person("Charlotte","Bornte",60));

		
		return list;
	}

}
