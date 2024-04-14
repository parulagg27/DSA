package dsa.graphs.closestCarrot;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Problem Description:  given in a grid, a starting row, and a starting column. In the grid, "X"s are walls,
 * "O"s are open spaces, and "C"s are carrots. The method should return a number representing the length of the shortest path
 * from the starting position to a carrot. You may move up, down, left, or right, but cannot pass through walls (X).
 * If there is no possible path to a carrot, then return -1.
 */
public class ClosestCarrot {

    /**
     * @Time_complexity: O(r * c) - iterating over each element in grid in worst case
     * @Space_complexity O(r * c) + storage in queue - worst case: storing all nodes in visited list.
     */
    public static int closestCarrot(List<List<String>> grid, int startRow, int startCol) {
        if (grid.get(startRow).get(startCol) == "X") return -1;
        int maxRows = grid.size();
        int maxCols = grid.get(0).size();
        List<SimpleEntry<Integer, Integer>> visited = new ArrayList<>();
        Queue<SimpleEntry<SimpleEntry<Integer, Integer>, Integer>> queue = new ArrayDeque<>();
        var node = new SimpleEntry<>(startRow, startCol);
        queue.add(new SimpleEntry<>(node, 0));
        while (!queue.isEmpty()) {
            var first = queue.remove();
            if (visited.contains(first.getKey())) continue;
            int row = first.getKey().getKey();
            int col = first.getKey().getValue();
            int distance = first.getValue();
            if (grid.get(row).get(col).equals("C")) return distance;
            visited.add(first.getKey());
            if (row + 1 < maxRows && grid.get(row + 1).get(col) != "X") {
                node = new SimpleEntry<>(row + 1, col);
                queue.add(new SimpleEntry<>(node, distance + 1));
            }
            if (row - 1 >= 0 && grid.get(row - 1).get(col) != "X") {
                node = new SimpleEntry<>(row - 1, col);
                queue.add(new SimpleEntry<>(node, distance + 1));
            }
            if (col + 1 < maxCols && grid.get(row).get(col + 1) != "X") {
                node = new SimpleEntry<>(row, col + 1);
                queue.add(new SimpleEntry<>(node, distance + 1));
            }
            if (col - 1 >= 0 && grid.get(row).get(col - 1) != "X") {
                node = new SimpleEntry<>(row, col - 1);
                queue.add(new SimpleEntry<>(node, distance + 1));
            }
        }
        return -1;
    }

    //TODO: add more readable and slightly optimised approach for this
}
