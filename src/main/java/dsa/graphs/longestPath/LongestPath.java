package dsa.graphs.longestPath;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPath {

    //TODO: REDO : visualise solution
    //TODO: also solve problem by storing all paths

    /**
     * Time taken - 1st time: 1.5 + hint.
     * @Time_complexity O(e) -> Going over each node exactly once, not repeating since storing distance from each node in a map
     * @Space_complexity O(n) -> due to recursion and stack space used
     */
    public static int longestPath(Map<String, List<String>> graph) {
        int maxPath = 0;
        for (String node: graph.keySet()) {
            int pathLength = getPathLength(node, graph, new HashMap<>());
            if (pathLength > maxPath) maxPath = pathLength;
        }
        return maxPath;
    }


    private static int getPathLength(String node, Map<String, List<String>> graph,
                                     HashMap<String, Integer> distance) {
        //distance to track max length from each node
        if (graph.get(node).isEmpty()) {
            distance.put(node, 0);
            return 0;
        }
        if (distance.containsKey(node)) return distance.get(node);
        int maxLength = 0;

        for (String neighbour: graph.get(node)) {
            int length = getPathLength(neighbour, graph, distance);
            if (maxLength < length) maxLength = length;
        }

        distance.put(node, maxLength + 1); //can update map at end after getting max length from all child nodes
        return maxLength + 1;
    }
}
