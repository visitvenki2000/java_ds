package tuf.recursion;

public class Permutations {

	// Returns true if str[curr] does not matches with any of the
	// characters after str[start]
	//pick each element for first position...and remaning position check for all elements so on...
	// swapping is to simulate above behavior 
	//method 1 without swap...add each element into data strucutre and remove once done...
	static int counter =0;
	    static boolean shouldSwap(char str[], int start, int curr) {
	        for (int i = start; i < curr; i++) {
	            if (str[i] == str[curr]) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	// Prints all distinct permutations in str[0..n-1]
	    static void findPermutations(char str[], int index, int n) {
	    	  System.out.println("index "+index+"  ---- "+new String(str));
	        if (index >= n) {
	            System.out.println(" ---- "+new String(str));
	            counter++;
	            return;
	        }
	 
	        for (int i = index; i < n; i++) {
	        	  System.out.println("----------start For loop index ---------"+index);
	 
	            // Proceed further for str[i] only if it
	            // doesn't match with any of the characters
	            // after str[index]
	            boolean check = shouldSwap(str, index, i);
	            if (check) {
	                swap(str, index, i);
	                findPermutations(str, index + 1, n);
	                swap(str, index, i);
	            }
	            
	            System.out.println("----------end For loop index ---------"+index);
	        }
	    }
	 
	    static void swap(char[] str, int i, int j) {
	        char c = str[i];
	        str[i] = str[j];
	        str[j] = c;
	    }
	 
	    // Driver code
	    public static void main(String[] args) {
	 
	        char str[] = {'A', 'B', 'C', 'D'};
	        //char str[] = {'A', 'B', 'C'};
	        int n = str.length;
	        findPermutations(str, 0, n);
	        
	        System.out.println("--Total "+counter);
	    }
}
