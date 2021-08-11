package geeks.arrays;

import geeks.Util;

public class WaterTrap {

	public WaterTrap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WaterTrap max = new WaterTrap();
		//int [] data = {5,0,6,2,3};
		int [] data = {3,0,1,2,5};
		max.calWaterTrapped(data);
		
		
		
		
	}
	// find matching sum of sub array of non negitive integers 
	public void calWaterTrapped(int [] data) {
	// calculate lef max ...
		
		int [] leftMax = new int [data.length];
		int [] rightMax = new int [data.length];
		
		 leftMax[0] = data[0];
		for( int i=1;i<data.length;i++) {
			

			leftMax[i] = Math.max(data[i], leftMax[i-1]);
		}
		
		rightMax[data.length-1] = data[data.length-1];
		
		for( int i=data.length-2;i>=0;i--) {

			rightMax[i] = Math.max(data[i], rightMax[i+1]);
		}
	
  int sum = 0;
  
  Util.print(leftMax);
  Util.print(rightMax);
  
	for( int i=1;i<data.length-1;i++) {
		
		sum = sum+Math.min(leftMax[i], rightMax[i])-data[i];
		//System.out.println("Sum ---"+sum);
	}
		
System.out.println("Sum ---"+sum);

	}
	
}
