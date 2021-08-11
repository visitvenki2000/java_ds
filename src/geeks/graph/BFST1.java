package geeks.graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFST1 {

	public BFST1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v =8;
		ArrayList<ArrayList<Integer>> adjGraph = new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<=v;i++)
			adjGraph.add(new ArrayList<Integer>());
		
		addEdge(adjGraph,1,2);
		addEdge(adjGraph,2,3);	
		addEdge(adjGraph,2,7);
		
		addEdge(adjGraph,3,5);
		addEdge(adjGraph,7,5);
		
		addEdge(adjGraph,4,6);
		
		System.out.println("Cycle "+traverse(adjGraph,v));
		
	}
	
	


	
	public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v) {
		
		
		list.get(u).add(v);
		list.get(v).add(u);
		
	}
	
	public static boolean  traverse(ArrayList<ArrayList<Integer>> graph,int v) {
		
		boolean visited[] = new boolean[v];
		//int count = 0;

		for (int i = 1; i < v; i++) {

			if (visited[i] == false) {
		
				boolean result = bfsCycle(graph, i,visited);
				if(result==true)
					return true;
			}

		}
		return false;
	}
	
	public static void bfs(ArrayList<ArrayList<Integer>> list,int v, boolean [] visited) {
		
		visited[v]= true;
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(v);
		System.out.println("Visited "+v);
		while(!q.isEmpty()) {
			
		int data =	q.poll();
		
		
		ArrayList<Integer> adg = list.get(data);
		
		for(Integer e:adg)  {
			if (visited[e] == false)  {
		    q.add(e);		
		    visited[e]= true;
		    System.out.println("Visited "+e);
			System.out.println("-----------adding----  "+e); 
			}
		}
		
		}
		
	}

	
public static boolean bfsCycle(ArrayList<ArrayList<Integer>> list,int v, boolean [] visited) {
		
		visited[v]= true;
		boolean result = false;
		LinkedList<Node> q = new LinkedList<Node>();
		q.add(new Node(v,-1));
		System.out.println("Visited "+v);
	
		while(!q.isEmpty()) {
			
			Node current =	q.poll();
		
		
		ArrayList<Integer> adg = list.get(current.first);
		
		for(Integer e:adg)  {
			if (visited[e] == false)  {
		    q.add(new Node(e,current.first));		
		    visited[e]= true;
		    System.out.println("Visited "+e);
			System.out.println("-----------adding----  "+e +"---Parent-"+current.first); 
			}else if(e!=current.second) {
				System.out.println("-----------e Visited already----  "+e); 	
				System.out.println("-----------processing----  "+current.first);
				return true;
			}
		}
	
		}
		
		return result;
	}



}
class Node {
	
	int first;
	int second;
	Node(int fir, int sec){
		first = fir;
		second =sec;
	}
}
