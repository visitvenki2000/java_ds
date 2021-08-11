package geeks.arrays;

public class Leader {

	public Leader() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Leader l = new Leader();
		int [] data = {7,10,4,3,6,5,2};
		l.printLeader(data);
		
		
		
	}
	
	public void printLeader(int [] data) {
		
		int max =0;
		for(int i=data.length-1;i>=0;i--) {
			if(data[i]>max) {
				
				System.out.print("-"+data[i]);
				max= data[i];
			}
			
		}
		
	}

}
