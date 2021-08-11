package geeks.strings;


	public class RabinKarpPattern 
	{
	    // d is the number of characters in 
	    // the input alphabet
	    public final static int d = 256;
	    
	 
	    
	    
	    /* Driver program to test above function */
	    public static void main(String[] args)
	    {
	        String txt = "GEEKS FOR GEEKS";
	        String pat = "GEEK";
	        int q = 101; // A prime number
	        search2(pat, txt, q);
	        System.out.println("");
	        System.out.println("---------------2nd program-----");
	        search(pat, txt, q);
	    }
	    
	    
	    /*
	     * 1) compute h - pre compute d*(m-1) >>> d*(m-1)%q  
	     * use q modulo to avoid large nos
	     * 2) compute hash of pattern , and first batch of text hash 	     * 
	     * 3) compute next next batch of text hash and keep comparing ..
	     * 4)  handle -ve  , stop loop at (n-m)
	     */
	    
	static void search(String pat, String txt, int q) {

		int m = pat.length();
		int n = txt.length();
		int p = 0, t = 0;
		int d = 256;
		// Step1 - pre compute h
		int h = 1;
		for (int i = 0; i < m - 1; i++) // till m-1 only as we need to calculate 1 less..
			{h = (h * d) % q; 
			System.out.println("--h- " + h );
			}
		// Step 2 compute hash of pat and first set of text 
		//p(i)=pat.char(o)+ pat.cahr(1)*d+pat.cahr(2)*d**2
		
		for (int i = 0; i < m; i++) {
			p = (p * d + pat.charAt(i)) % q;
			t = (t * d + txt.charAt(i)) % q;
		}
		System.out.println("h final  " + h );
		System.out.println("p and t first set- " + p + "," + t);
		// Step 3 // loop and if hash matches check all characters are equal
		for (int i = 0; i <= n - m; i++) {
			// if both hash values equal ....
			// first hash of txt already computed above
			System.out.println("i -" + i + "-t-" + t);
			if (p == t) {
				// check all characters of both
				boolean matched = true;
				for (int j = 0; j < m; j++) {

					if (pat.charAt(j) != txt.charAt(i + j)) {
						matched = false;
						break;
					}
				}
				if (matched)
					System.out.println(" Pattern found at : " + i + " ");

			}
			// Step 4 compute next hash of txt t
			
			 if ( i < n-m ) {
			t = (d*(t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
			if (t < 0)
				t = t + q;
			
			 }

		}

	}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    /* pat -> pattern
        txt -> text
        q -> A prime number
    */
	    static void search2(String pat, String txt, int q)
	    {
	        int M = pat.length();
	        int N = txt.length();
	        int i, j;
	        int p = 0; // hash value for pattern
	        int t = 0; // hash value for txt
	        int h = 1;
	    
	        // The value of h would be "pow(d, M-1)%q"
	        for (i = 0; i < M-1; i++) {
	            h = (h*d)%q;
	   
	            
	        }
	        // h = value of char * d**m-1 +value of next char *d**m-2 as value will be high divide by modulo..
	         
		    		System.out.println("-h-"+h);
	        
	        // Calculate the hash value of pattern and first
	        // window of text
	        for (i = 0; i < M; i++)
	        {
	            p = (d*p + pat.charAt(i))%q;
	            t = (d*t + txt.charAt(i))%q;
	        }
			System.out.println("-p-"+p);
	        // Slide the pattern over text one by one
	        for (i = 0; i <= N - M; i++)
	        {
				System.out.println("i -"+i+"-t-"+t);
	    
	            // Check the hash values of current window of text
	            // and pattern. If the hash values match then only
	            // check for characters on by one
	            if ( p == t )
	            {
	                /* Check for characters one by one */
	                for (j = 0; j < M; j++)
	                {
	                    if (txt.charAt(i+j) != pat.charAt(j))
	                        break;
	                }
	    
	                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
	                if (j == M)
	                    System.out.println("Pattern found at index " + i);
	            }
	    
	            // Calculate hash value for next window of text: Remove
	            // leading digit, add trailing digit
	            if ( i < N-M )
	            {
	                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q;
	    
	                // We might get negative value of t, converting it
	                // to positive
	                if (t < 0)
	                t = (t + q);
	            }
	        }
	    }
	    
	
	}
