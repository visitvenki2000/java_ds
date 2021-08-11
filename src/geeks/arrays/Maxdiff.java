package geeks.arrays;

public class Maxdiff {

	public Maxdiff() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Maxdiff max = new Maxdiff();
		int [] data = {2,3,10,6,4,8,1};
		max.maxdiff(data);
		
		
		
		
	}
	
	public void maxdiff(int [] data) {
		
		int min = data[0];
		int diff =0;
		for(int i=1;i<data.length;i++)
		{
			
			if(data[i]<min)
				min= data[i];
			
			if(data[i]-min>diff)
				diff= data[i]-min;
			
				
		}
		System.out.println("Maz diff "+diff);
		
	}


}
