package dsa.graphs.islands;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;

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

    //TODO: add solution by BFS
}
