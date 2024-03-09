package dsa.graphs.undirectedGraph;

import java.util.*;

/**
 * Problem Description: Given a list of edges for an undirected graph and two nodes (nodeA, nodeB).
 * return a boolean indicating whether there exists a path between nodeA and nodeB.
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
                                         String src, String dst, List<String> visitedNodes) {
        if (src.equals(dst)) return true;
        for (String neighbour : graph.get(src)) {
            if (!visitedNodes.contains(neighbour)) {
                visitedNodes.add(neighbour);
                if (dfsWithCycles(graph, neighbour, dst, visitedNodes)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean bfsWithCycle(Map<String, List<String>> graph, String src, String dst) {
        if (!graph.containsKey(src) || !graph.containsKey(dst)) return false;
        if (src.equals(dst)) return true;
        List<String> visited = new ArrayList<>();
        Queue<String> queue = new ArrayDeque<>();
        queue.add(src);

        while (!queue.isEmpty()) {
            String first = queue.remove();
            if (first.equals(dst)) return true;
            for (String neighbour: graph.get(first)) {
                if (visited.contains(neighbour)) continue;
                queue.add(neighbour);
                visited.add(first);
            }
        }
        return false;
    }

    /**
     * TODO: Catch: map.get(key) => returns value reference / soft copy. So accessing value from map and modifying it in
     * same line, modifies the original value reference for that key in map. Ex: line 72, 73
     * @Time_complexity O(e) - going over each edge + additional time to update map
     * @Space_complexity O(n + e) - number of nodes as key, plus each edge as neighbour
     */
    private static Map<String, List<String>> convertToAdjList(List<List<String>> edges) {
        Map<String, List<String>> graph = new HashMap<>();
        for (List<String> edge: edges) {
            String src = edge.get(0);
            String dst = edge.get(1);
            if (!graph.containsKey(src)) {
                graph.put(src, new ArrayList<>());
            }

            if (!graph.containsKey(dst)) {
                graph.put(dst, new ArrayList<>());
            }
            graph.get(src).add(dst);
            graph.get(dst).add(src);
        }
        return graph;
    }
}
