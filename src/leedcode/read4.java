package leedcode;

import java.util.Arrays;

public class read4 {

	public read4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[] data = new char[4];
		char[] dest = new char[10];
		System.out.println("test : "+data.length);
		data[0] ='a';
		System.out.println("test data : "+Arrays.toString(data));
		for(int i=0;i<data.length;i++) {
			
			if(data[i]!=' ')
				dest[i]=data[i];
			
		}
		
		System.out.println("test dest : "+Arrays.toString(dest));
		
	}

}

/*
 * 
 *  public int read(char[] buf, int n) {
        
        buf = new char[n];
    
        int currIndex =0;
       
        while(currIndex<n ){
            
            int remaining = n-currIndex;
            int charToread = 4;
            if(remaining<4) 
                charToread = remaining;
            
            char[] tempBuff= new char[4]; ;
            read4(tempBuff);
            // copy to buf
            int count =0;
            for(int i=0;i<charToread;i++){
                
                if(!Character.isWhitespace(tempBuff[i])){
                    count++;
                    buf[currIndex++]=tempBuff[i];
                    
                }
                
              
            }
              if(count<4 || remaining<4)
                    break;
           
            
            
            
        }
        return currIndex;
    }
}
*/
