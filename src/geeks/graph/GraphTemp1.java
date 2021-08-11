package geeks.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphTemp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		
		// initialize graph = 
		int v =4 ;
		for(int i=0;i<v;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
		
	
		
		//System.out.println("------bfs start ");
	  // bfs(graph,1,v);
		
		//----------disconnected 
		//testDFSDataDiscconnected(graph);
		//System.out.println("------DFS start ");
		//dfs2(graph,  v);
		//----------disconnected 
	
		//-------------dfs  shortest path 
		testAddShortestUndir(graph);
		bfsShortestPath(graph,0,v);
		//-------------dfs  shortest path 

	}
	static void testOne(ArrayList<ArrayList<Integer>> graph) {
		addEdge(graph,0,1);
		addEdge(graph,0,2);
		addEdge(graph,1,2);
		addEdge(graph,1,3);
		print(graph);
		
	}
	
	static void testAddShortestUndir(ArrayList<ArrayList<Integer>> graph) {
		addEdge(graph,0,1);
		addEdge(graph,0,2);
		addEdge(graph,1,2);
		addEdge(graph,1,3);
		addEdge(graph,2,3);
		print(graph);
		
	}
	static void testDFSData(ArrayList<ArrayList<Integer>> graph) {
		addEdge(graph,0,1);
		addEdge(graph,0,2);	
		addEdge(graph,1,3);
		addEdge(graph,2,3);
		addEdge(graph,1,4);
		addEdge(graph,4,5);
		print(graph);
		
	}
	static void testDFSDataDiscconnected(ArrayList<ArrayList<Integer>> graph) {
		addEdge(graph,0,1);
		addEdge(graph,0,2);
		addEdge(graph,1,2);
		addEdge(graph,3,4);

		print(graph);
		
	}
	
	static void addEdge(ArrayList<ArrayList<Integer>> graph,int u, int v) {
		
		graph.get(u).add(v);
		graph.get(v).add(u);
		
	}
	static void print(ArrayList<ArrayList<Integer>> graph) {
		
		
		for(ArrayList<Integer> tempV:graph) {
			
			for(Integer temp:tempV) {
				System.out.print(temp+" ");
			}
			System.out.println(" ");
		}
		
	}
	
	// source vertex index given 
	// add to Q. and get
	// maintain visited array 
	// use boolean array ...
	// use Queue type for q

	static void bfs(ArrayList<ArrayList<Integer>> graph, int source,int v) {
		Queue<Integer> q =  new LinkedList<Integer>();
		boolean[] visited = new boolean[v];
		visited[source]=true;
		q.add(source);
		while(!q.isEmpty()) {
			int temp = q.remove();
			System.out.println(""+temp);
			ArrayList<Integer> tempList = graph.get(temp);
			for(Integer vert : tempList) {
				
				if(visited[vert]==false) {
				q.add(vert);
				visited[vert]=true;
				}
			}
			
		}
		
	}
	
	static void bfsShortestPath(ArrayList<ArrayList<Integer>> graph, int source,int v) {
		Queue<Integer> q =  new LinkedList<Integer>();
		boolean[] visited = new boolean[v];
		int [] dist = new int [v];
		for(int i:dist) {
			dist[i]=-1;
		
		}
		visited[source]=true;
		dist[source]=0;
		q.add(source);
		while(!q.isEmpty()) {
			int temp = q.remove();
			System.out.println(""+temp);
			ArrayList<Integer> tempList = graph.get(temp);
			for(Integer vert : tempList) {
				
				if(visited[vert]==false) {
				q.add(vert);
				visited[vert]=true;
				System.out.println(" u distance "+dist[temp]+"--"+vert);
				dist[vert]=(dist[temp]+1);
				//System.out.println("upating distane "+dist[vert]+"--"+vert);
				}
			}
			
		}
		
		//-- print dist 
		System.out.println(" Distane array "+Arrays.toString(dist));
		for(int j:dist) {
			//System.out.print(" "+j+"--"+dist[j]);
		
		}
		
	}
	
	/// dfs  - recursion -
	
	static void dfs(ArrayList<ArrayList<Integer>> graph, int source,int v) {
		
		// initialize visited array -
		boolean [] visited = new boolean[v];	
		
		dfsRec(graph,source,visited);
		
	}
	/*
	 * checking no of ilands in Graph BFS
	 */
static void dfs2(ArrayList<ArrayList<Integer>> graph,int v) {
		
		// initialize visited array -
		boolean [] visited = new boolean[v];
		int count =0;
		for(int i=0;i<v;i++) 
		{
			System.out.println("-loop "+i);
			if(visited[i]==false) {
			dfsRec(graph,i,visited);
			count++;
			}
		}
		
		System.out.println("--------------------No of Ilands ------- "+count);
		
	}
	
	static void dfsRec(ArrayList<ArrayList<Integer>> graph, int source,boolean [] visited ) {
		
		// print source and loop thru children 

	System.out.println("##----------## "+source);
	visited[source] =true;

	// loop thru children and call rec
	for(Integer temp:graph.get(source)) {
		System.out.println("temp "+temp);
		if(visited[temp]==false)
			dfsRec(graph,temp,visited);		
		
	}
		
		
	}
}
