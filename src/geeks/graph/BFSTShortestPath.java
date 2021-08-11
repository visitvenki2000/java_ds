package geeks.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/*
 * Perform topo sort Get Stack of sorted 
 * use Node 
 * update distance array with stack array processing 
 * Use distance array to update ..fill with int max
 */
public class BFSTShortestPath {

	public BFSTShortestPath() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v =9;
		ArrayList<ArrayList<Integer>> adjGraph = new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++)
			adjGraph.add(new ArrayList<Integer>());
		
		addEdge(adjGraph,0,1);
		addEdge(adjGraph,0,3);	
		addEdge(adjGraph,1,3);
		
		addEdge(adjGraph,3,4);
		addEdge(adjGraph,4,5);
		
		addEdge(adjGraph,5,6);
		
		addEdge(adjGraph,1,2);
		addEdge(adjGraph,2,6);
		addEdge(adjGraph,6,7);
		addEdge(adjGraph,6,8);
		addEdge(adjGraph,7,8);
		
		System.out.println("Shortest path "+traverse(adjGraph,v));
		
	}
	
	


	
	public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v) {
		
		
		list.get(u).add(v);
		list.get(v).add(u);
		
	}
	
	public static boolean  traverse(ArrayList<ArrayList<Integer>> graph,int v) {
		
		boolean visited[] = new boolean[v];
		int dist [] = new int[v];
		Arrays.fill(dist, Integer.MAX_VALUE);

		//for (int i = 1; i < v; i++) {

			//if (visited[i] == false) {
		
				bfs(graph, 0,visited,dist);
			
			//}

		//}
				
				 System.out.println("Distance Array form 0");
				for (int i = 0; i < v; i++) {
					 System.out.println("i-"+i+"--"+dist[i]);
				}
		return false;
	}
	
	public static void bfs(ArrayList<ArrayList<Integer>> list,int v, boolean [] visited, int [] dist) {
		
		visited[v]= true;
		dist[v]=0;
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(v);
		
		while(!q.isEmpty()) {
			
		int data =	q.poll();
		
		
		ArrayList<Integer> adg = list.get(data);
		
		for(Integer e:adg)  {
			if (dist[e]>dist[data]+1)  {
		    q.add(e);		 
		    dist[e] = Math.min(dist[e], dist[data]+1);
		    System.out.println("Distance Updated e "+e+"-#-"+dist[e]);
		   
			}
		}
		
		}
		
	}

	




}
