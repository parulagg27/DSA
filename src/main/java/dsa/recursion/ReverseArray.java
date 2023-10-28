package dsa.recursion;

public class ReverseArray {

    /**
     * Approach: Create a new array and traverse given array from reverse side
     * Time complexity: O(n) - since we traverse the entire given array of size n
     * Space complexity: O(n) - since creating a new array
     */
    public static int[] reverseViaNewArray(int n, int[] nums) {
        int[] reversedArray = new int[n];
        int i;
        for (i = n - 1; i >= 0; i--) {
            reversedArray[n - 1 - i] = nums[i];
        }
        return reversedArray;
    }

    /**
     * Approach: Reverse the given array in place by traversing till half of array and accessing elements on opposite ends.
     * Time complexity: O(n) - actual complexity = n/2, since traversing half of array.
     * Space complexity: O(1) - since not using any extra space.
     */
    public static int[] reverseArrayByHalfTraversal(int n, int[] nums) {
        int index;
        for (index = 0; index < n / 2; index++) {
            int temp = nums[index];
            nums[index] = nums[n - 1 - index];
            nums[n - 1 - index] = temp;
        }
        return nums;
    }

    /**
     * Approach: Similar to reverseArrayByHalfTraversal method. Only difference is that 2 pointers are used instead of 1.
     * Time complexity: O(n) - actual complexity = n/2, since traversing half of array.
     * Space complexity: O(1) - since not using any extra array space.
     */
    public static int[] reverseArrayByTwoPointers(int n, int[] nums) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
}
