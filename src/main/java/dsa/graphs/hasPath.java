package dsa.graphs;

import java.util.Map;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class hasPath {

    /**
     * @Time_complexity O(e)
     * @Space_complexity O(n)
     */
    public static boolean hasPath(Map<String, List<String>> graph, String src, String dst) {
        if (!graph.containsKey(src) || !graph.containsKey(dst)) return false;
        if (src.equals(dst)) return true;
        Stack<String> stack = new Stack<>();
        stack.push(src);
        while (!stack.isEmpty()) {
            String top = stack.pop();
            if (Objects.equals(top, dst)) return true;
            for (String neighbour: graph.get(top)){
                stack.push(neighbour);
            }
        }
        return false;
    }

    /**
     * @Time_complexity O(e)
     * @Space_complexity O(n)
     */
    public static boolean hasPathViaRecursion(Map<String, List<String>> graph, String src, String dst) {
        if (!graph.containsKey(src) || !graph.containsKey(dst)) return false;
        if (src.equals(dst)) return true;
        for (String neighbour: graph.get(src)) {
            if (hasPathViaRecursion(graph, neighbour, dst)) {
                return true;
            }
        }
        return false;
    }
}
