package dsa.arrays.pairSum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairSum {

    /**
     * Naive approach that uses nested iteration with 2 pointers to compute pair sum
     * @Time_complexity O(n ^ 2) as nested iterations till size of input
     * @Space_complexity O(1) since no new auxiliary space created for computation
     */
    public static List<Integer> pairSum(List<Integer> numbers, int targetSum) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == targetSum) return List.of(i, j);
            }
        }
        return null;
    }

    /**
     * Approach: slightly modified than pairSum naive approach. Instead of using nested loops, using single loop and
     * resetting pointers if end of array is reached by second pointer.
     * @Time_complexity O(n) - using single loop
     * @Space_complexity O(1) - using constant auxiliary space to compute the indices.
     */
    public static List<Integer> pairSumViaSingleLoop(List<Integer> numbers, int target) {
        int i = 0, j = 1;
        while (i < numbers.size()) {
            if (numbers.get(i) + numbers.get(j) == target) return List.of(i, j);
            j++;
            if (j == numbers.size()) {
                i++;
                j = i + 1;
            }
        }
        return null;
    }

    /**
     * Approach: Use hashMap to store an already traversed element and find its compliment.
     * @Time_complexity O(n) - since iterating over list
     * @Space_complexity O(n) - since using hashmap
     */
    public static List<Integer> pairSumViaCompliment(List<Integer> numbers, int target) {
        Map<Integer, Integer> numberIndexes = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++){
            int number = numbers.get(i);
            if (numberIndexes.containsKey(target - number)) {
                return List.of(numberIndexes.get(target - number), i);
            }
            numberIndexes.put(number, i);
        }
        return null;
    }
}
