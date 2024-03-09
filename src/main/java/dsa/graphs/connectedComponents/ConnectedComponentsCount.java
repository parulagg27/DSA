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
     * Approach: Find neighbours of each node till and track them in set. Unique set of paths are obtained as result.
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

    public static Set<Integer> getNeighbours(Map<Integer, List<Integer>> graph, Integer src) {
        Set<Integer> neighbours = new HashSet<>();
        return getNeighbours(graph, src, neighbours);
    }

    public static Set<Integer> getNeighbours(Map<Integer, List<Integer>> graph, Integer src, Set<Integer> neighbours) {
        if (neighbours.contains(src)) return neighbours;
        neighbours.add(src);
        for (Integer neighbour: graph.get(src)) {
            getNeighbours(graph, neighbour, neighbours);
        }
        return neighbours;
    }
}
