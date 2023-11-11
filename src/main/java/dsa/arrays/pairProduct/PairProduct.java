package dsa.arrays.pairProduct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairProduct {

    /**
     * Naive approach that uses nested iteration with 2 pointers to compute pair sum
     * @Time_complexity O(n ^ 2) as nested iterations till size of input
     * @Space_complexity O(1) since no new auxiliary space created for computation
     */
    public static List<Integer> pairProduct(List<Integer> numbers, int targetProduct) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) * numbers.get(j) == targetProduct) return List.of(i, j);
            }
        }
        return null;
    }

    /**
     * Approach: slightly modified than pairProduct naive approach. Instead of using nested loops, using single loop and
     * resetting pointers if end of array is reached by second pointer.
     * @Time_complexity O(n) - using single loop
     * @Space_complexity O(1) - using constant auxiliary space to compute the indices.
     */
    public static List<Integer> pairProductViaSingleLoop(List<Integer> numbers, int target) {
        int i = 0, j = 1;
        while (i < numbers.size()) {
            if (numbers.get(i) * numbers.get(j) == target) return List.of(i, j);
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
     * Since iterating over each element in array, thus encountering same element at same index twice is not feasible in this approach.
     * @Time_complexity O(n) - since iterating over list
     * @Space_complexity O(n) - since using hashmap
     */
    public static List<Integer> pairProductViaHashMap(List<Integer> numbers, int target) {
        Map<Integer, Integer> previousNums = new HashMap<>();
        for (int index = 0; index < numbers.size(); index++){
            int number = numbers.get(index);
            int compliment = target / number;
            if (previousNums.containsKey(compliment)) {
                return List.of(previousNums.get(compliment), index);
            }
            previousNums.put(number, index);
        }
        return null;
    }
}
