package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class GraphImpl
{
	HashMap<Integer, HashSet<Integer>> graph = new HashMap<>(); //Structure Created
	
	void addVertex(int data)
	{
		if(graph.containsKey(data))
		{
			System.out.println("Vertex " + data + " already exists.");
			return;
		}
		graph.put(data, new HashSet<>()); //Added a vertex
	}
	
	void addEdge(int u, int v)
	{
		//u ke set mein v daalenge
		graph.get(u).add(v); //One direction
	}
	
	void print()
	{
		for(Integer vertex:graph.keySet())
		{
			System.out.print("Vertex " + vertex + ": ");
			System.out.println(graph.get(vertex));
		}
	}
	
	void BFS(int s)//Start the BFS from vertex s
	{
		System.out.println("------BFS------");
		HashSet<Integer> visited = new HashSet<Integer>(); //to store if the vertex has been already visited
		Queue<Integer> q = new LinkedList<Integer>();
		
		visited.add(s);
		q.add(s);
		
		while(!q.isEmpty())
		{
			int i = q.poll();
			System.out.print(i + " "); //Pick the front most element and print it.
			
			//add the unvisited neighbors of i into the queue
			for(Integer x: graph.get(i)) //pick neighbors one by one
			{
				if(!visited.contains(x)) //check if neighbor is already visited
				{
					visited.add(x); //mark it as visited
					q.add(x);//and, add it to the queue
				}
			}
		}
		System.out.println();
		System.out.println("-------------------------");
	}
	
	void DFS(int s)
	{
		System.out.println("------DFS------");
		HashSet<Integer> visited = new HashSet<Integer>();
		DFSUtil(s, visited); //Utility/Helper function -> To pass the same array to all the recursive calls
		System.out.println();
	}
	
	void DFSUtil(int s, HashSet<Integer> visited)
	{
		System.out.print(s + " ");
		visited.add(s);
		for(Integer x:graph.get(s)) //pick all neighbors of s one by one
		{
			if(!visited.contains(x)) //If neighbor not visited
			{
				DFSUtil(x, visited); //Do DFS on that neighbor 
			}
		}
	}
}

public class GraphSM {

	public static void main(String[] args) {
		GraphImpl g = new GraphImpl();
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		
		g.print();
		
		g.BFS(0);
		g.BFS(2);
		
		g.DFS(0);
	}

}
