package epsi;

import epsi.graph.floyd_warshall.FloydWarshallGraph;

public class Main
{
    public static void main(String[] args)
    {
        int[][] graph = new int[5][5];

        // Initialising the Floyd Warshall Graph object
        FloydWarshallGraph floydWarshallGraphObject = new FloydWarshallGraph(graph);
        floydWarshallGraphObject.initialize();

        // Overriding the generated graph
        graph = floydWarshallGraphObject.getGraph();
        graph[0][1] = 3;
        graph[0][2] = 8;
        graph[0][3] = 4;
        graph[0][4] = -4;

        graph[1][3] = 1;
        graph[1][4] = 7;

        graph[2][1] = 4;

        graph[3][0] = 2;
        graph[3][2] = -5;

        graph[4][3] = 6;
        floydWarshallGraphObject.setGraph(graph);

        // Display initial graph
        System.out.println(floydWarshallGraphObject.toString());

        // Process and display the processed graph
        floydWarshallGraphObject.process();
        System.out.println(floydWarshallGraphObject.toString());
    }
}
