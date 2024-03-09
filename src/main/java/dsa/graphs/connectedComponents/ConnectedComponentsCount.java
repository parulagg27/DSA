package dsa.graphs.connectedComponents;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Problem:  return the number of connected components within the graph.
 */
public class ConnectedComponentsCount {

    /**
     * Approach: Traverse each node, Find neighbours for each and track them in set. Unique set of paths are obtained as result.
     * @Time_complexity O(V * E) -> loop repeats v times: gets neighbours for each vertex * going over each edge to get all neighbours
     * @Space_complexity O(V + V + V) -> Set to track unique neighbours, Recursion over each node taking stack space + connected components set
     */
    public static int connectedComponentsCount(Map<Integer, List<Integer>> graph) {
        Set<Set<Integer>> connectedComponents = new HashSet<>();
        for (Integer key: graph.keySet()){
            Set<Integer> neighbours = getNeighbours(graph, key);
            connectedComponents.add(neighbours);
        }
        return connectedComponents.size();
    }

    /**
     * Approach:
     * 1) Keep main list to track visited nodes. [to avoid finding neighbours for nodes already visited [i.e. getting same neighbour set]
     * 2) Loop over each node, i.e., key to start traversal of complete paths
     * 3) Traversal logic + increment count on 1 complete traversal
     * @Time_complexity O(E+V) -> since loop do not execute for nodes already visited [so no V*E]
     * @Space_complexity O(V+V) -> V: to track traversed nodes. V: for recursive traversal of path
     */
    public static int connectedComponentsOptimised(Map<Integer, List<Integer>> graph) {
        Set<Integer> visitedNodes = new HashSet<>();
        int count = 0;
        for (int key: graph.keySet()) {
            if (traversePath(graph, key, visitedNodes)){
                count ++;
            }
        }
        return count;
    }

    private static boolean traversePath(Map<Integer, List<Integer>> graph, int src, Set<Integer> visitedNodes) {
        if (visitedNodes.contains(src)) return false;
        visitedNodes.add(src);
        for (int neighbour: graph.get(src)) {
            traversePath(graph, neighbour, visitedNodes);
        }
        return true;
    }

    private static Set<Integer> getNeighbours(Map<Integer, List<Integer>> graph, Integer src) {
        Set<Integer> neighbours = new HashSet<>();
        return getNeighbours(graph, src, neighbours);
    }

    private static Set<Integer> getNeighbours(Map<Integer, List<Integer>> graph, Integer src, Set<Integer> neighbours) {
        if (neighbours.contains(src)) return neighbours;
        neighbours.add(src);
        for (Integer neighbour: graph.get(src)) {
            getNeighbours(graph, neighbour, neighbours);
        }
        return neighbours;
    }
}
