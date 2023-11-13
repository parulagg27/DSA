package dsa.arrays.fiveSort;

import java.util.List;

/**
 * Problem Description: Rearrange elements of the ArrayList such that all 5s appear at the end and array is sorted in-place
 */
public class FiveSort {

    /** Using two pointer approach
     * @Time_complexity O(n): since we can iterate over entire array in worst case.
     * @Space_complexity O(n): Auxiliary space is constant with increasing input size.
     */
    public static int[] fiveSort(int[] input){
        int i = 0, j = input.length - 1;
        if (input.length <= 1) return input;
        while (i < j){
            if (input[i] != 5) i++;
            else if (input[j] == 5) j--;
            else {
                int swap = input[j];
                input[j] = input[i];
                input[i] = swap;
                i++;
                j--;
            }
        }
        return input;
    }

    /** Using two pointer approach with List instead of primitive int type array.
     * @Time_complexity O(n): since we can iterate over entire array in worst case.
     * @Space_complexity O(n): Auxiliary space is constant with increasing input size.
     */
    public static List<Integer> fiveSortViaList(List<Integer> input) {
        int i = 0, j = input.size() - 1;
        if (input.size() <= 1) return input;
        while (i < j){
            if (input.get(i) != 5) i++;
            else if (input.get(j) == 5) j--;
            else {
                int swap = input.get(j);
                input.set(j, input.get(i));
                input.set(i, swap);
                i++;
                j--;
            }
        }
        return input;
    }
}
