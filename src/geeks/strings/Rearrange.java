package geeks.strings;

public class Rearrange {

	public Rearrange() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] data = "yyyyttygggyyyggtt".toCharArray();

		int ycount =0;
		int tcount=0;
		int gcount=0;
		for(int i=0;i<data.length;i++) {
			
			if(data[i]=='y')
				ycount++;
			if(data[i]=='t')
				tcount++;
			
			if(data[i]=='g')
				gcount++;
			
			
		}
	System.out.println("vlaues:y"+ycount+"-"+tcount+"-"+gcount);
	
	char [] data2 = new char[data.length];
	
	for(int i=0;i<data.length;i++) {
		
		if(i<=ycount)
		data2[i]='y';
		
		if(i>ycount && i<=ycount+tcount)
			data2[i]='t';
		
		if(i>=ycount+tcount)
			data2[i]='g';
		
	}
	System.out.println("vlaues1:"+new String(data));
	
	//* print data.toString prints address not data 
	System.out.println("vlaues2:"+new String(data2));
	
	
	}

}
