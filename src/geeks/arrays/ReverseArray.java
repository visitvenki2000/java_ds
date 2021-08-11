package geeks.arrays;

public class ReverseArray {

	public ReverseArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] dataArray2  = {1,4,5,6,7,8};  
		int [] dataArray ={1,4,5,6,7,8,9};
		
		//int n = dataArray.length;
		for(int i=0;i<dataArray.length;i++) {
			
			if(i<dataArray.length-(i+1)) {
			int temp = dataArray[i];
			dataArray[i] = dataArray[dataArray.length-(i+1)];
			dataArray[dataArray.length-(i+1)] = temp;
			}else {
				break;
			}
			
			
		}
		for(int i=0;i<dataArray.length;i++) 
		System.out.print("-"+dataArray[i]);

	}

}
