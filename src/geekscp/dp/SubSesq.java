package geekscp.dp;

import java.util.ArrayList;
import java.util.List;

public class SubSesq {
	
	public static void mian(String [] args) {
		
		getPermutation(5,4);
	}

	public SubSesq() {
		// TODO Auto-generated constructor stub
	}
	
	public static String getPermutation(int n, int k) {
        int fact = 1; 
        List<Integer> numbers = new ArrayList<Integer>(); 
        for(int i = 1;i<n;i++) {
            fact = fact * i; 
            numbers.add(i); 
        }
        numbers.add(n); 
        String ans = ""; 
        k = k - 1; 
        while(true) {
            ans = ans + numbers.get(k / fact); 
            numbers.remove(k / fact); 
            if(numbers.size() == 0) {
                break; 
            }
            
            k = k % fact; 
            fact = fact / numbers.size();
        }
        return ans; 
    }

}
