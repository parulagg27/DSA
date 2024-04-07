package dsa.graphs;


import java.util.*;
import java.util.AbstractMap.SimpleEntry;

/**
 * Problem Description: Given a list of edges for an undirected graph and two nodes (nodeA, nodeB).
 * The method should return the length of the shortest path between A and B.
 * Consider the length as the number of edges in the path, not the number of nodes.
 * If there is no path between A and B, then return -1.
 */
public class ShortestPath {

    /**
     * Approach: Go by BFS, to find the first occurrence of destination & thus the shortest path
     * @Space_complexity O(V+E) + O(2V) + O(V)
     * @Time_complexity O(E) + O(V)
     */
    public static int shortestPath(List<List<String>> edges, String nodeA, String nodeB) {
        HashMap<String, List<String>> adjList = convertToAdjList(edges);
        Queue<SimpleEntry<String, Integer>> nodesWithDistance = new ArrayDeque<>();
        List<String> visited = new ArrayList<>();
        nodesWithDistance.add(new SimpleEntry<>(nodeA, 0));
        visited.add(nodeA);

        while (!nodesWithDistance.isEmpty()) {
            SimpleEntry<String, Integer> last = nodesWithDistance.remove();
            int lastDistance = last.getValue();
            String lastNode = last.getKey();
            if (lastNode.equals(nodeB)) return lastDistance;
            for (String neighbour: adjList.get(lastNode)) {
                if (visited.contains(neighbour)) continue;
                nodesWithDistance.add(new SimpleEntry<>(neighbour, lastDistance + 1));
                visited.add(neighbour);
            }
        }

        return -1;
    }

    //Time - E, Space: V + E
    private static HashMap<String, List<String>> convertToAdjList(List<List<String>> edges){
        HashMap<String, List<String>> adjList = new HashMap<>();
        for (List<String> edge: edges) {
            String src = edge.get(0);
            String dst = edge.get(1);
            if (!adjList.containsKey(src)) {
                adjList.put(src, new ArrayList<>());
            }
            if (!adjList.containsKey(dst)) {
                adjList.put(dst, new ArrayList<>());
            }
            adjList.get(src).add(dst);
            adjList.get(dst).add(src);
        }
        return adjList;
    }

}
