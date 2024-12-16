import java.util.Scanner;

class Graph {
    private int[][] adjacencyMatrix;
    private int numberOfVertices;

    public Graph(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        adjacencyMatrix = new int[numberOfVertices][numberOfVertices];
    }

    public void addEdge(int vertex1, int vertex2) {
        if (vertex1 < numberOfVertices && vertex2 < numberOfVertices) {
            adjacencyMatrix[vertex1][vertex2] = 1; // Directed graph
            adjacencyMatrix[vertex2][vertex1] = 1; // Undirected graph
            System.out.println("Edge added between vertex " + vertex1 + " and vertex " + vertex2);
        } else {
            System.out.println("Invalid vertex numbers.");
        }
    }

    public void removeEdge(int vertex1, int vertex2) {
        if (vertex1 < numberOfVertices && vertex2 < numberOfVertices) {
            adjacencyMatrix[vertex1][vertex2] = 0;
            adjacencyMatrix[vertex2][vertex1] = 0;
            System.out.println("Edge removed between vertex " + vertex1 + " and vertex " + vertex2);
        } else {
            System.out.println("Invalid vertex numbers.");
        }
    }

    public void display() {
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < numberOfVertices; i++) {
            for (int j = 0; j < numberOfVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isEdge(int vertex1, int vertex2) {
        if (vertex1 < numberOfVertices && vertex2 < numberOfVertices) {
            return adjacencyMatrix[vertex1][vertex2] == 1;
        } else {
            System.out.println("Invalid vertex numbers.");
            return false;
        }
    }
}

public class AdjacencyMatrixGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        Graph graph = new Graph(vertices);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add an edge");
            System.out.println("2. Remove an edge");
            System.out.println("3. Display the adjacency matrix");
            System.out.println("4. Check if there is an edge");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter vertex 1: ");
                    int vertex1 = scanner.nextInt();
                    System.out.print("Enter vertex 2: ");
                    int vertex2 = scanner.nextInt();
                    graph.addEdge(vertex1, vertex2);
                    break;
                case 2:
                    System.out.print("Enter vertex 1: ");
                    int vertex1ToRemove = scanner.nextInt();
                    System.out.print("Enter vertex 2: ");
                    int vertex2ToRemove = scanner.nextInt();
                    graph.removeEdge(vertex1ToRemove, vertex2ToRemove);
                    break;
                case 3:
                    graph.display();
                    break;
                case 4:
                    System.out.print("Enter vertex 1: ");
                    int vertex1Check = scanner.nextInt();
                    System.out.print("Enter vertex 2: ");
                    int vertex2Check = scanner.nextInt();
                    boolean isEdge = graph.isEdge(vertex1Check, vertex2Check);
                    if (isEdge) {
                        System.out.println("There is an edge between vertex " + vertex1Check + " and vertex " + vertex2Check);
                    } else {
                        System.out.println("No edge between vertex " + vertex1Check + " and vertex " + vertex2Check);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
