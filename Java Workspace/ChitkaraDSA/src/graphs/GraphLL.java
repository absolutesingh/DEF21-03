package graphs;

import java.util.LinkedList;
import java.util.Queue;

//Adjacency List representation with fixed vertices
class Graph{
	int v; //No. of vertices
	//int arr[] = new int[v];
	//String arr[] = new String[v];
	LinkedList<Integer> arr[];
	
	Graph(int v)
	{
		this.v = v;
		arr = new LinkedList[v]; //Only created the array to store a LinkedList
		
		for(int i=0;i<v;i++)
		{
			arr[i] = new LinkedList<Integer>(); //Initializing empty LL's at each array Index
		}
	}
	
	void addEdge(int u, int v) //(u,v) edge from u to v
	{
		arr[u].add(v); //added end to the neighbor list of start
		//arr[v].add(u); //For bidirectional graph
	}
	void print()
	{
		for(int i=0;i<v;i++)
		{
			System.out.print("Element " + i + ": ");
			for(Integer x:arr[i])
			{
				System.out.print(x + " "); //Printing neighbors of i
			}
			System.out.println();
		}
	}
	
	void BFS(int s)//Start the BFS from vertex s
	{
		System.out.println("------BFS------");
		boolean visited[] = new boolean[v]; //to store if the vertex has been already visited
		Queue<Integer> q = new LinkedList<Integer>();
		
		visited[s] = true;
		q.add(s);
		
		while(!q.isEmpty())
		{
			int i = q.poll();
			System.out.print(i + " "); //Pick the front most element and print it.
			
			//add the unvisited neighbors of i into the queue
			for(Integer x: arr[i]) //pick neighbors one by one
			{
				if(!visited[x])
				{
					visited[x] = true; //mark it as visited
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
		boolean visited[] = new boolean[v];
		DFSUtil(s, visited); //Utility/Helper function -> To pass the same array to all the recursive calls
		System.out.println();
	}
	
	void DFSUtil(int s, boolean visited[])
	{
		System.out.print(s + " ");
		visited[s] = true;
		for(Integer x:arr[s]) //pick all neighbors of s one by one
		{
			if(!visited[x]) //If neighbor not visited
			{
				DFSUtil(x, visited); //Do DFS on that neighbor 
			}
		}
	}
	
	void DFSOverall()
	{
		System.out.println("------DFS Overall------");
		boolean visited[] = new boolean[v];
		int count = 0;
		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			{
				DFSUtil(i, visited); //Utility/Helper function -> To pass the same array to all the recursive calls
				System.out.println();
				count++;
			}
		}
		System.out.println("Total Number of Connected Components are: " + count);
	}
	
}
public class GraphLL {

	public static void main(String[] args) {
		Graph g = new Graph(7);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		
//		----------adding another component----------
		g.addEdge(5, 6);
		g.print();
		
		g.BFS(0);
		g.BFS(2);
		
		g.DFS(0);
		g.DFSOverall();
	}

}
