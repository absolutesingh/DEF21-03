package graphs;

import java.util.Scanner;

public class GraphAlgos {

	static int[] dijkstra(int adjMatrix[][], int source) {
		int v = adjMatrix.length; // No. of vertices
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
			for (int j = 0; j < v; j++) {
				// Traversing neighbors that are unvisited
				if (adjMatrix[minVertex][j] != 0 && !visited[j]) // Not zero means neighbor
				{
					int newDist = distance[minVertex] + adjMatrix[minVertex][j];
					if (newDist < distance[j]) {
						distance[j] = newDist;
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

	static int[] prims(int adjMatrix[][], int source) {
		int v = adjMatrix.length; // No. of vertices
		boolean visited[] = new boolean[v];
		int distance[] = new int[v];
		int parent[] = new int[v];

		for (int i = 0; i < v; i++) {
			distance[i] = Integer.MAX_VALUE;
			parent[i] = -1;// parent is -1 by default
		}

		distance[source] = 0;
		for (int i = 0; i < v - 1; i++) {
			int minVertex = findMinVertex(distance, visited);
			visited[minVertex] = true;
			// Traverse the neighbors row
			for (int j = 0; j < v; j++) {
				// Traversing neighbors that are unvisited
				if (adjMatrix[minVertex][j] != 0 && !visited[j]) // Not zero means neighbor
				{
					if (adjMatrix[minVertex][j] < distance[j]) {
						distance[j] = adjMatrix[minVertex][j];
						parent[j] = minVertex;
					}
				}
			}
		}
		print(parent, "Parents array: ");
		return distance;
	}

	static void print(int arr[], String msg) {
		System.out.println(msg);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of vertices: ");
		int v = sc.nextInt();
		System.out.println("Enter no. of edges: ");
		int e = sc.nextInt();
		int adjMatrix[][] = new int[v][v];
		System.out.println("Enter all edges with weight: ");
		for (int i = 0; i < e; i++) {
			int startVertex = sc.nextInt();
			int endVertex = sc.nextInt();
			int w = sc.nextInt();
			adjMatrix[startVertex][endVertex] = w;
			adjMatrix[endVertex][startVertex] = w; // bidirectional graph
		}
		sc.close();

		int shortestPathFromZero[] = dijkstra(adjMatrix, 0);
		print(shortestPathFromZero, "Dijkstras with 0 as source");

		int mst[] = prims(adjMatrix, 0);
		print(mst, "Prims with 0 as source");
	}

}
