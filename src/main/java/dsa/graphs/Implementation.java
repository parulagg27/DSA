package dsa.graphs;

import java.util.*;

public class Implementation {

    /**
     * Graphs don't have a starting point unlike trees that have root.
     * Thus, for graph algorithms, source needs to be specified.
     */
    public static void depthFirst(Map<String, List<String>> graph, String source) {
        Stack<String> stack = new Stack<>();
        if (!graph.containsKey(source)) return;
        stack.push(source);
        while (!stack.isEmpty()) {
            String top = stack.pop();
            System.out.println(top);
            //get list of all nodes
            for (String neighbour: graph.get(top)){
                stack.push(neighbour);
            }
        }
    }

    public static void depthFirstRecursive(Map<String, List<String>> graph, String source) {
        if (!graph.containsKey(source)) return;
        System.out.println(source);
        for (String neighbour: graph.get(source)){
            depthFirstRecursive(graph, neighbour);
        }
    }

    public static void breadthFirst(Map<String, List<String>> graph, String source) {
        if (!graph.containsKey(source)) return;
        Queue<String> queue = new ArrayDeque<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            String node = queue.remove();
            System.out.println(node);
            queue.addAll(graph.get(node));
        }
    }

    /**
     * Map.of() returns immutable collection of key, values
     */
    public static void run(String[] args)  {
        Map<String, List<String>> graph = Map.of(
                "a", List.of("c", "b"),
                "b", List.of("d"),
                "c", List.of("e"),
                "d", List.of(),
                "e", List.of()
        );
        depthFirst(graph, "a");
        breadthFirst(graph, "a");
        depthFirstRecursive(graph, "a");
    }
}
