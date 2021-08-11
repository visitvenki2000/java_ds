package memory;

public class MemoryTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoryTest1 mt = new MemoryTest1();
		Integer t = new Integer(1);
		mt.changeValue(t);
		System.out.println(t);
	}
	
	
	public void changeValue(Integer x) {
		x= new Integer(5);
		System.out.println(x);
		
	}
	
	/// output 1 .. why value not changed as we passed ref 

}
