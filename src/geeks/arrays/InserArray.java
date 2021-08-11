package geeks.arrays;

public class InserArray {

	public InserArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] dataArray = new int[7];
		int cap =0;
		
		dataArray[0] =5;  cap++;
		dataArray[1] =6;  cap++;
		
		dataArray[2] =7;  cap++;
		//dataArray[3] =9;  cap++;
		
		InserArray in = new InserArray();
		
		in.insert(dataArray, cap, 9, 3);
		cap++;
		print(dataArray);
		
		in.insert(dataArray, cap, 3, 1);
		cap++;
		print(dataArray);
		
		in.insert(dataArray, cap, 10, 1);
		cap++;
		
		print(dataArray);
		in.insert(dataArray, cap, 12, 1);
		cap++;
		// cap 7  length =6
		
		print(dataArray);
	
		
		in.insert(dataArray, cap, 13, 1);
		//cap++;
		print(dataArray);
		
		in.insert(dataArray, cap, 14, 1);
		//cap++;
		print(dataArray);
		
		int returnValue  = in.delete(dataArray, 12, cap);
		print(dataArray);
		
		System.out.println("-Returnvalue-"+returnValue);
		
		
	}

	public void insert (int [] arr,int cap,int item, int index) {
		
		
		if(cap>=arr.length)
			return ;  // if size is full
		
		if(index>=cap) {
			
			arr[index] = item;
			 cap++;
		}else {
			
			for(int i=cap;i>=index;i--) {
				System.out.println("i"+i);
			
				arr[i] =arr[i-1]; // shift one element up 
			
			}
			
			arr[index] = item;
			 cap++;
			
		}
		
	}
	
	public int delete(int [] data , int item, int cap) {
		
		int idx = -1;
		for(int i=0;i<(cap);i++) {
			
			if(data[i]==item)
				idx=i;
			}
		// shift from i+1 to cap 
		if(idx!=-1) {
		for(int i=idx;i<(cap-1);i++)
			data[i]=data[i+1];
		
		data[cap-1]=0;
		return cap--;
		}else {
			
			return -1;
		}

	}
	
	public static void print(int [] dataArray){
		
		for(int i=0;i<dataArray.length;i++) 
		System.out.print("-"+dataArray[i]);
		System.out.println("");
	}
}
