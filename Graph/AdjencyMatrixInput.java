import java.util.*;

public class AdjencyMatrixInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int v = sc.nextInt();
        System.out.println("Enter the number of edges");
        int e = sc.nextInt();

        int[][] adjMatrix = new int[v][v];

        for(int i=0; i<e; i++){
            System.out.println("Enter the source vertex");
            int sv = sc.nextInt();
            System.out.println("Enter the destination vertex");
            int dv = sc.nextInt();

            adjMatrix[sv][dv] = 1;
            adjMatrix[dv][sv] = 1; // for undirected graph
        }

        System.out.println("The adjacency matrix is: ");
        for(int i=0; i<v; i++){
            for(int j=0; j<v; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}