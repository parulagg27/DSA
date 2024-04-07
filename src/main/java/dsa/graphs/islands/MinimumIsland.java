package dsa.graphs.islands;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Problem description: W represents water and L represents land.The method should return the size of the
 * smallest island. An island is a vertically or horizontally connected region of land.
 */
public class MinimumIsland {

    /**
     * @Time_complexity O(r*c)
     * @Space_complexity O(r*c) - storing all nodes in worst case for all nodes as land
     * Time taken to solve (T1): 1hr 10min
     */
    public static int minIslandByDFS(List<List<String>> grid) {
        List<SimpleEntry<Integer, Integer>> visited = new ArrayList<>();
        int minSize = Integer.MAX_VALUE;
        for (int r = 0; r < grid.size(); r++) {
            for (int c = 0; c < grid.get(0).size(); c++) {
                int size = processIsland(r, c, grid, visited);
                if (size < minSize && size != 0) minSize = size;
            }
        }
        return minSize;
    }

    private static int processIsland(int r, int c, List<List<String>> grid,
                                     List<SimpleEntry<Integer, Integer>> visited) {
        if (r < 0 || r >= grid.size()) return 0;
        if (c < 0 || c >= grid.get(0).size()) return 0;
        if (Objects.equals(grid.get(r).get(c), "W")) return 0;
        SimpleEntry<Integer, Integer> node = new SimpleEntry<>(r, c);
        if (visited.contains(node)) return 0;
        int size = 1;
        visited.add(node);
        size += processIsland(r - 1, c, grid, visited);
        size += processIsland(r + 1, c, grid, visited);
        size += processIsland(r, c - 1, grid, visited);
        size += processIsland(r, c + 1, grid, visited);
        return size;
    }

    //TODO: find min island by BFS
}
