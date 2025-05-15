import java.util.*;

public class GraphDegreeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of vertices
        System.out.println("Enter the number of vertices:");
        int n = sc.nextInt();

        // Step 2: Create adjacency matrix
        int[][] graph = new int[n][n];

        // Step 3: Input edges
        System.out.println("Enter edges (from to), enter -1 -1 to stop:");
        while (true) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            if (u == -1 && v == -1) {
                break;
            }

            if (u >= 0 && u < n && v >= 0 && v < n) {
                graph[u][v] = 1;
            } else {
                System.out.println("Invalid edge. Please enter nodes between 0 and " + (n - 1));
            }
        }

        // Step 4: Initialize degree arrays
        int[] inDegree = new int[n];
        int[] outDegree = new int[n];

        // Step 5: Count in-degree and out-degree
        for (int i = 0; i < n; i++) {         // for each source
            for (int j = 0; j < n; j++) {     // for each destination
                if (graph[i][j] == 1) {
                    outDegree[i]++;
                    inDegree[j]++;
                }
            }
        }

        // Step 6: Print degrees
        System.out.println("\nVertex\tIn-Degree\tOut-Degree");
        for (int i = 0; i < n; i++) {
            System.out.println(i + "\t\t" + inDegree[i] + "\t\t" + outDegree[i]);
        }

        sc.close();
    }
}
