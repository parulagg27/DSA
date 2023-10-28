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
        int start;
        for (start = 0; start < n / 2; start++) {
            int temp = nums[start];
            nums[start] = nums[n - 1 - start];
            nums[n - 1 - start] = temp;
        }
        return nums;
    }

    /**
     * Approach: Similar to reverseArrayByHalfTraversal method. Only difference is that 2 pointers are used instead of 1.
     * Time complexity: O(n) - actual complexity = n/2, since traversing half of array.
     * Space complexity: O(1) - since not using any extra array space.
     */
    public static int[] reverseArrayByTwoPointers(int n, int[] nums) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }

    /**
     * Approach: Similar to reverseArrayByTwoPointers but using recursion to iterate from opposite ends of array
     * Time complexity: O(n) - actual complexity = n/2, since traversing half of array.
     * Space complexity: O(1) - since not using any extra array space.
     */
    public static int[] reverseArrayByRecursion(int n, int[] nums) {
        return reverseArrayByRecursion(0, n - 1, nums);
    }

    private static int[] reverseArrayByRecursion(int start, int end, int[] nums) {
        if (start >= end) return nums;
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        return reverseArrayByRecursion(start + 1, end - 1, nums);
    }
}
