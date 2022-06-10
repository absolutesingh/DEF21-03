package graphs;

import java.util.LinkedList;

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
	
	void addEdge(int start, int end) //(u,v)
	{
		arr[start].add(end); //added end to the neighbor list of start
		arr[end].add(start); //For bidirectional graph
	}
}
public class GraphLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
