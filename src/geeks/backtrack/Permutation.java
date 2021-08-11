package geeks.backtrack;

public class Permutation {

	public static void permute(String str, int l, int r){
	    
        if(l==r){
           // if(str.contains("AB")==false){
                System.out.print(" *** "+str+" *** ");
            //}
            return;
        }else{
            for(int i=l;i<=r;i++){
                str=new String(swap(str, i, l));
                System.out.println(i+"-----swapped -- "+str);
                permute(str,l+1,r);
                System.out.println(i+"-----swapped back "+str);
                str=new String(swap(str, i, l));
            }   
        }
    }
    
    public static char[] swap(String str, int i, int j) 
    { 
        char ch[] = str.toCharArray(); 
        char temp = ch[i]; 
        ch[i] = ch[j]; 
        ch[j] = temp; 
        return ch; 
    }
    
    public static void main(String args[])
    {
        String str="ABC";
	
        permute(str,0,str.length()-1); 
    }
	
	public static void printPerm(String str, int l, int r){
		
		
		if(l==r) {
			System.out.println(""+str);
		}else {
			
			for(int i=l;i<r;i++) {
				
				//swap()
			}
		}
		
	}
	public static void swap2(String str, int l,int r) {
		
		char temp = str.charAt(l);
		String result =  str.substring(0, l) + temp + str.substring(l);
		
		
	}

}
