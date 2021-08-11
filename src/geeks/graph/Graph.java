package geeks.graph;

import java.util.ArrayList;

public class Graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v =5;
	ArrayList<ArrayList<Integer>> adjGraph = new ArrayList<ArrayList<Integer>>(v);
	
	for(int i=0;i<v;i++)
		adjGraph.add(new ArrayList<Integer>());
	
	addEdge(adjGraph,0,1);
	addEdge(adjGraph,0,2);
	addEdge(adjGraph,1,3);	
	addEdge(adjGraph,1,2);
	addEdge(adjGraph,2,3);
	addEdge(adjGraph,2,4);
	addEdge(adjGraph,3,4);
	
	//print(adjGraph);
	GraphBFS.bfs(adjGraph, v, 0);
		
	}
	
	public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v) {
		
		
		list.get(u).add(v);
		list.get(v).add(u);
		
	}
	
	public static void print(ArrayList<ArrayList<Integer>> list) {
		
		
		
		for(ArrayList<Integer> outer:list) {
			for(Integer temp: outer) {
				System.out.print(" "+temp); }
			System.out.println(" "); 
			
		}
	}
	

}
