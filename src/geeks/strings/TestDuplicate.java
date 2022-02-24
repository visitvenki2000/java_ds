package geeks.strings;

public class TestDuplicate {

	public TestDuplicate() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String S = "aba";
		
		
		int count[]= new int[256];
        for(int i=0;i<S.length();i++){

            count[S.charAt(i)] =  count[S.charAt(i)]+1 ;
        }
		int result =-1;
        for(int i=0;i<count.length;i++){

           if(count[i]==2)
        	   result=i;
        }
        char result2 = (char)result;  ;
    	System.out.println("--"+result2);
        
		
		String s = "Test data";
		StringBuffer sbf = new StringBuffer();
		
		
	int count2[]= new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			if(count[s.charAt(i)]==0) {
				
				sbf.append(s.charAt(i));
				count[s.charAt(i)]++;
			}else {
				count[s.charAt(i)]++;
			}
		}
		
		System.out.println("--"+sbf);
	}

}

// output --:Test da