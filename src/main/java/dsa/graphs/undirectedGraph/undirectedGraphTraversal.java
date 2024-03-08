package dsa.graphs.undirectedGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem Description: takes in a list of edges for an undirected graph and two nodes (nodeA, nodeB).
 * The method should return a boolean indicating whether or not there exists a path between nodeA and nodeB.
 */
public class undirectedGraphTraversal {

    public static boolean undirectedPath(List<List<String>> edges, String nodeA, String nodeB) {
        Map<String, List<String>> graph = convertToAdjList(edges);
        List<String> visitedNodes = new ArrayList<>();
        return dfsWithCycles(graph, nodeA, nodeB, visitedNodes);
    }

    /**
     * @Time_complexity O(e)
     * @Space_complexity O(n) + O(n) [for visited nodes]
     */
    private static boolean dfsWithCycles(Map<String, List<String>> graph,
                                         String src, String dst, List<String> visitedNodes){
        if (src.equals(dst)) return true;
        for (String neighbour: graph.get(src)) {
            if (!visitedNodes.contains(neighbour)){
                visitedNodes.add(neighbour);
                if (dfsWithCycles(graph, neighbour, dst, visitedNodes)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @Time_complexity O(e) - going over each edge + additional time to update map
     * @Space_complexity O(n + e) - number of nodes as key, plus each edge as neighbour
     */
    private static Map<String, List<String>> convertToAdjList(List<List<String>> edges){
        Map<String, List<String>> graph = new HashMap<>();
        List<String> neighbours;
        for (List<String> edge: edges) {
            if (!graph.containsKey(edge.get(0))) {
                neighbours = new ArrayList<>();
                neighbours.add(edge.get(1));
                graph.put(edge.get(0), neighbours);
            } else {
                neighbours = graph.get(edge.get(0));
                neighbours.add(edge.get(1));
                graph.put(edge.get(0), neighbours);
            }

            if (!graph.containsKey(edge.get(1))) {
                neighbours = new ArrayList<>();
                neighbours.add(edge.get(0));
                graph.put(edge.get(1), neighbours);
            } else {
                neighbours = graph.get(edge.get(1));
                neighbours.add(edge.get(0));
                graph.put(edge.get(1), neighbours);
            }
        }
        return graph;
    }
}
