package geeks.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*
 * Perform topo sort Get Stack of sorted 
 * use Node 
 * update distance array with stack array processing 
 * Use distance array to update ..fill with int max
 */
public class DfsShortestDAG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v =6;
		ArrayList<ArrayList<Pair>> adjGraph = new ArrayList<ArrayList<Pair>>(v);
		
		for(int i=0;i<v;i++)
			adjGraph.add(new ArrayList<Pair>());
		addEdge(adjGraph,0,1,2);
		addEdge(adjGraph,0,4,1);
	
		addEdge(adjGraph,1,2,3);
		
		addEdge(adjGraph,2,3,6);	
		addEdge(adjGraph,4,2,2);
		addEdge(adjGraph,4,5,4);
		addEdge(adjGraph,5,3,1);
	

	System.out.println(" Short path "+dfsShortPath(adjGraph,v,0));
	
			
		}
		
	
	public static void addEdge(ArrayList<ArrayList<Pair>> list,int u,int v,int w) {
		
		
		list.get(u).add(new Pair(v,w));
		list.get(v).add(new Pair(v,w));
		
	}
	
		
		public static boolean dfsShortPath(ArrayList<ArrayList<Pair>> adg, int v, int s) {

			boolean visited[] = new boolean[v];
			boolean dfs[] = new boolean[v];
			Stack<Integer> st = new Stack<>();
			int count = 0;

			for (int i = 0; i < v; i++) { // 1 base index 

				if (visited[i] == false) {
					count++;
					dfsRecursion(adg, visited, i,st);
						
				}

			}
			System.out.println("Top Sorted ------ ");
			int [] dist = new int[v];
			Arrays.fill(dist, Integer.MAX_VALUE);
			dist[s]=0;
			while(!st.isEmpty()) {
				
				int vert = st.pop();
				updateShortPath(adg,dist,vert);
				
			}
			
			 System.out.println("Distance Array form 0");
				for (int i = 0; i < v; i++) {
					 System.out.println("i-"+i+"--"+dist[i]);
				}
				
			return false;

		}

	public static void updateShortPath(ArrayList<ArrayList<Pair>> adg, int[] dist, int vert) {

		if (dist[vert] != Integer.MAX_VALUE) {

			ArrayList<Pair> list = adg.get(vert);

			for (Pair p : list) {
				int v = p.vertex;

				if (dist[v] > dist[vert] + p.weight) {

					dist[v] = dist[vert] + p.weight;
				}

			}

		}
	}
		
		public static void dfsRecursion(ArrayList<ArrayList<Pair>> adg,boolean[] visited, int s, 	Stack st  ) {
			visited[s]= true;
			for(int i=0;i<adg.get(s).size();i++) {
				int temp = adg.get(s).get(i).vertex;
				
				if(visited[temp]==false) {
					 dfsRecursion(adg,visited,temp,st) ;
				}
			}
			st.push(s);
			
		}

}

class Pair {
	
	int vertex;
	int weight;
	Pair(int ver, int wei){
		vertex = ver;
		weight =wei;
	}
}
