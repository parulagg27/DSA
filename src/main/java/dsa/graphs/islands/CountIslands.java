package dsa.graphs.islands;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayDeque;

/**
 * Problem description: Given a grid containing Ws and Ls. W represents water and L represents land.
 * The method should return the number of islands on the grid. An island is a vertically or horizontally connected region of land.
 */
public class CountIslands {

    /**
     * @Time_complexity O(r * c) :going over each node + not visiting already visited nodes
     * @Space_complexity O( r * c) : in worst case if storing all nodes as land
     */
    public static int islandCountByDFS(List<List<String>> grid) {
        List<SimpleEntry<Integer, Integer>> visited = new ArrayList<>();
        int count = 0;
        for (int r = 0; r < grid.size(); r++) {
            for (int c = 0; c < grid.get(0).size(); c++) {
                if (processIsland(r, c, grid, visited)) count += 1;
            }
        }
        return count;
    }

    /**
     * @Time_complexity O (r * c)
     * @Space_complexity O(r * c)
     */
    public static int islandCountByBFS(List<List<String>> grid) {
        List<SimpleEntry<Integer, Integer>> visited = new ArrayList<>();
        Queue<SimpleEntry<Integer, Integer>> island = new ArrayDeque<>();
        var maxRows = grid.size();
        var maxCol = grid.get(0).size();
        int count = 0;
        for (int r = 0; r < maxRows; r++) {
            for (int c = 0; c < maxCol; c++) {
                if (grid.get(r).get(c).equals("W")) continue;
                island.add(new SimpleEntry<>(r, c));
                if (processIslandByQueue(grid, island, visited)) {
                    count += 1;
                    System.out.println("current count : " + count);
                }
            }
        }
        return count;
    }

    private static boolean processIslandByQueue(List<List<String>> grid, Queue<SimpleEntry<Integer, Integer>> island,
                                             List<SimpleEntry<Integer, Integer>> visited) {
        int maxRows = grid.size();
        int maxCol = grid.get(0).size();
        int islandSize = 0;
        while (!island.isEmpty()) {
            var first = island.remove();
            var row = first.getKey();
            var col = first.getValue();
            if (visited.contains(first)) continue;
            System.out.println("current row: " + row + " current col: " + col);
            islandSize += 1;
            visited.add(first);
            if (row + 1 < maxRows && isALand(grid, row + 1, col)) island.add(new SimpleEntry<>(row + 1, col));
            if (row - 1 >= 0 && isALand(grid, row - 1, col)) island.add(new SimpleEntry<>(row - 1, col));
            if (col + 1 < maxCol && isALand(grid, row, col + 1)) island.add(new SimpleEntry<>(row, col + 1));
            if (col - 1 >= 0 && isALand(grid, row, col - 1)) island.add(new SimpleEntry<>(row, col - 1));
        }
        return islandSize > 0;
    }

    private static boolean isALand(List<List<String>> grid, Integer row, Integer col) {
        return grid.get(row + 1).get(col) == "L";
    }

    private static boolean processIsland(int r, int c, List<List<String>> grid,
                                         List<SimpleEntry<Integer, Integer>> visited) {
        if (r < 0 || r >= grid.size()) return false;
        if (c < 0 || c >= grid.get(0).size()) return false;
        if (grid.get(r).get(c).equals("W")) return false;
        SimpleEntry<Integer, Integer> node = new SimpleEntry<>(r, c);
        if (visited.contains(node)) return false;
        visited.add(node);
        processIsland(r - 1, c, grid, visited);
        processIsland(r + 1, c, grid, visited);
        processIsland(r, c - 1, grid, visited);
        processIsland(r, c + 1, grid, visited);
        return true;
    }
}
