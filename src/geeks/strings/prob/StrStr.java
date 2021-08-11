package geeks.strings.prob;

public class StrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GFG str = new GFG();
		System.out.println(str.strstr("abcabcabcd", "abcd"));
				

	}

}


class GFG
{
    int strstr(String str, String target)
    {
       // Your code here
        int m = target.length();
        int n = str.length();
        
       for(int i=0;i<=(n-m);i++){ // test till n-m only  add <= or n-m+1  as j is 0-3 ;
           boolean foundMatch =true;
           
           for(int j=0;j<m;j++){
               
               if(str.charAt(i+j)!=target.charAt(j)) {
               foundMatch=false; break; }
           }
           if(foundMatch){
               return i; //found match 
           }
       }
       return -1;

    }
}
