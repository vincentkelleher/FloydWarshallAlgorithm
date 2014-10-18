package epsi.graph.floyd_warshall;

import epsi.graph.Graph;

public class FloydWarshallGraph extends Graph
{
    public FloydWarshallGraph(int[][] graph)
    {
        super(graph);
    }

    public void process()
    {
        for (int y = 0; y < graph.length; y++) {
            for (int x = 0; x < graph[y].length; x++) {
                if (x != y && graph[y][x] != Integer.MAX_VALUE) {
                    int currentNodeValue = graph[y][x];

                    for (int i = 0; i < graph[x].length; i++) {
                        if (i != x && graph[x][i] != Integer.MAX_VALUE) {
                            int newNodeValue = currentNodeValue + graph[x][i];

                            if (newNodeValue < graph[y][x]) {
                                graph[y][x] = newNodeValue;
                            }
                        }
                    }
                }
            }
        }
    }
}
