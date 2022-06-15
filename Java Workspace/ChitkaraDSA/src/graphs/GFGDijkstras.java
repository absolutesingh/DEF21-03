package graphs;

//https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1/#
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// { Driver Code Starts
import java.util.ArrayList;

class DriverClass {
	public static void main(String args[]) throws IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			String str[] = read.readLine().trim().split(" ");
			int V = Integer.parseInt(str[0]);
			int E = Integer.parseInt(str[1]);

			ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
			for (int i = 0; i < V; i++) {
				adj.add(new ArrayList<ArrayList<Integer>>());
			}

			int i = 0;
			while (i++ < E) {
				String S[] = read.readLine().trim().split(" ");
				int u = Integer.parseInt(S[0]);
				int v = Integer.parseInt(S[1]);
				int w = Integer.parseInt(S[2]);
				ArrayList<Integer> t1 = new ArrayList<Integer>();
				ArrayList<Integer> t2 = new ArrayList<Integer>();
				t1.add(v);
				t1.add(w);
				t2.add(u);
				t2.add(w);
				adj.get(u).add(t1);
				adj.get(v).add(t2);
			}

			int S = Integer.parseInt(read.readLine());

			GFGDijkstras ob = new GFGDijkstras();

			int[] ptr = ob.dijkstra(V, adj, S);

			for (i = 0; i < V; i++)
				System.out.print(ptr[i] + " ");
			System.out.println();
		}
	}
}// } Driver Code Ends

// User function Template for Java

class GFGDijkstras {
	// Function to find the shortest distance of all the vertices
	// from the source vertex S.
	static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int source) {
		boolean visited[] = new boolean[v];
		int distance[] = new int[v];

		for (int i = 0; i < v; i++) {
			distance[i] = Integer.MAX_VALUE;
		}

		distance[source] = 0;
		for (int i = 0; i < v - 1; i++) {
			int minVertex = findMinVertex(distance, visited);
			visited[minVertex] = true;

			// Traverse the neighbors row
			ArrayList<ArrayList<Integer>> neighbors = adj.get(minVertex);
			for (ArrayList<Integer> x : neighbors) {
				int neighborIndex = x.get(0);
				int weight = x.get(1);
				// Traversing neighbors that are unvisited
				if (!visited[neighborIndex]) {
					int newDist = distance[minVertex] + weight;
					if (newDist < distance[neighborIndex]) {
						distance[neighborIndex] = newDist;
					}
				}
			}
		}

		return distance;
	}

	static int findMinVertex(int distance[], boolean visited[]) {
		int v = distance.length;
		int minVertex = -1;
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				if (minVertex == -1) {
					minVertex = i;
				} else if (distance[i] < distance[minVertex]) {
					minVertex = i;
				}
			}
		}

		return minVertex;
	}
}
