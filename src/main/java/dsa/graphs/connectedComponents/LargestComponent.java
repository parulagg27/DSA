package dsa.graphs.connectedComponents;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Problem: return the size of the largest connected component in the graph.
 */
public class LargestComponent {

    /**
     * @Time_complexity O(V + E)
     * @Space_complexity O(V + V) - tracking visited nodes + recursion
     */
    public static int largestComponentOptimised(Map<Integer, List<Integer>> graph) {
        Set<Integer> visitedNodes = new HashSet<>();
        int maxSize = 0;
        for (int node: graph.keySet()) {
            if (visitedNodes.contains(node)) continue;
            int count = findComponentSize(graph, node, visitedNodes);
            if (count > maxSize) maxSize = count;
        }
        return maxSize;
    }

    private static int findComponentSize(Map<Integer, List<Integer>> graph, int src, Set<Integer> visited) {
        if (visited.contains(src)) return 0;
        visited.add(src);
        int count = 1;
        for (int neighbour: graph.get(src)) {
            count += findComponentSize(graph, neighbour, visited);
        }
        return count;
    }

    /**
     * @Time_complexity O(V + E) -> tracking visited nodes along with each unique path
     * @Space_complexity O(V + V) -> additional space to track each neighbour node as well
     */
    public static int largestComponent(Map<Integer, List<Integer>> graph) {
        Set<Integer> visitedNodes = new HashSet<>();
        int maxSize = 0;
        for (int node: graph.keySet()) {
            if (visitedNodes.contains(node)) continue;
            Set<Integer> connectedComponent = findComponent(graph, node, new HashSet<>());
            if (connectedComponent.size() > maxSize) maxSize = connectedComponent.size();
            visitedNodes.addAll(connectedComponent);
        }
        return maxSize;
    }

    private static Set<Integer> findComponent(Map<Integer, List<Integer>> graph, int src, Set<Integer> connectedComponent) {
        if (connectedComponent.contains(src)) return connectedComponent;
        connectedComponent.add(src);
        for (int neighbour: graph.get(src)) {
            findComponent(graph, neighbour, connectedComponent);
        }
        return connectedComponent;
    }
}
