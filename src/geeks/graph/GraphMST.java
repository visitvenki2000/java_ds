package geeks.graph;

import java.util.Arrays;

public class GraphMST {
	
	
	public static int primMST(int[][] graph) {
		int result =0 ;
		// initialise mst boolen array
		// initialise key array
		int Vert = graph.length;
		boolean [] mst = new boolean[graph.length];
		int [] key = new int[graph.length];
		
		
		Arrays.fill(key, Integer.MAX_VALUE);
		key[0]=0;
		// Step 1 Start with vertex 0 - check min value from Key 
		
		for(int v=0;v<Vert;v++) {
			
			int u=-1;
			for(int i=0;i<Vert;i++)
			if(!mst[u] && (u==-1 || key[i]<key[u]))
			u = i;
			mst[u] =true;
			result =result + key[u];
			
			
		}
		
		
		
		
		
		return result;
	}
	
	public static void main(String[] args) 
	{  
		int graph[][] = new int[][] { { 0, 5, 8, 0}, 
    						{ 5, 0, 10, 15 }, 
    						{ 8, 10, 0, 20 }, 
    						{ 0, 15, 20, 0 },};  

		System.out.print(primMST(graph)); 
	}

}
