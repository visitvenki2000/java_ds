package geeks.graph;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * 3)	MST : Minimum no of edges with least weight required to connect…complete graph 
4)	MST  Step 1 -  Key Weight distance array -  start with infinity ….keep updating pick min of key and process .
MST Step 2 :  MST array …  keep adding  picked item in Boolean array … 
MST Step 3 :  process Adjacent list of picked …item update distance array and parent  Array…

 */
public class PrimMST2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v =5;
		ArrayList<ArrayList<Pair>> adjGraph = new ArrayList<ArrayList<Pair>>(v);
		
		for(int i=0;i<v;i++)
			adjGraph.add(new ArrayList<Pair>());
		
		addEdge(adjGraph,0,1,2);
		addEdge(adjGraph,0,3,6);	
		addEdge(adjGraph,1,2,3);
		
		
		addEdge(adjGraph,3,1,8);
		
		addEdge(adjGraph,1,4,5);
		
		addEdge(adjGraph,2,4,7);
	
		mst(adjGraph,v);
	
		
	}
	
	
	public static void addEdge(ArrayList<ArrayList<Pair>> list,int u,int v,int w) {
		
		
		list.get(u).add(new Pair(v,w));
		list.get(v).add(new Pair(v,w));
		
	}
	
	public static void mst(ArrayList<ArrayList<Pair>> list, int v) {

		int[] key = new int[v];
		boolean[] mst = new boolean[v];
		int[] parent = new int[v];
		Arrays.fill(parent, -1);
		Arrays.fill(key, Integer.MAX_VALUE);

		key[0] = 0;

		for (int i = 0; i < v - 1; i++) {

			int min = Integer.MAX_VALUE;
			int u = 0;
			for (int j = 0; j < v; j++) {
				if (mst[j] == false && key[j] < min) {
					min = key[j];
					u = j;
				}
			}
			mst[u] = true;
			System.out.println("Edge -"+u);

			ArrayList<Pair> adj = list.get(u);

			for (Pair p : adj) {

				if (mst[p.vertex] == false && key[p.vertex] > p.weight) {

					key[p.vertex] = p.weight;
					parent[p.vertex] = u;
					
					System.out.println("updating -"+p.vertex+"--"+p.weight);
				}

			}

		}
		
		for (int i = 1; i < v ; i++) {
			
			System.out.println("Edge -"+i+"-"+parent[i]);
			
			
		}

	}
			
			
	

}
