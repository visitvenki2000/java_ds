package java8;

public class Person implements Comparable<Person> {

	String firName;
	String lastName;
	int age;
	
	public Person(String firName, String lastName, int age) {
		super();
		this.firName = firName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirName() {
		return firName;
	}
	public void setFirName(String firName) {
		this.firName = firName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [firName=" + firName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return lastName.compareTo(o.getLastName());
	
	}
	
}
