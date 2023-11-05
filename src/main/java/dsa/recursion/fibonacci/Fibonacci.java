package dsa.recursion.fibonacci;

import java.util.Arrays;

public class Fibonacci {

    /**
     * Time complexity: O(2^n) - Max. no. of leaf nodes in last level of tree
     * Space complexity: O(n) - max. depth of binary tree = max. no. of function calls present in memory at a time.
     */
    public static int fibonacciWithRecursion(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacciWithRecursion(n - 1) + fibonacciWithRecursion(n - 2);
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n) - as we are using array to save result till nth fibonacci number
     */
    public static int fibonacciByLoop(int n){
        if (n == 0 || n == 1) return n;
        int[] fibonacci = new int[n+1];
        int i;
        for (i = 0; i <= n; i++){
            if (i == 0 || i == 1) fibonacci[i] = i;
            else fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci[n];
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static int fibonacciWithMemoizationAndMemoryOptimisation(int n){
        if (n == 0 || n == 1) return n;
        int secondLastFibonacci = 0;
        int lastFibonacci = 1;
        for (int i = 2; i <= n; i++){
            int current = lastFibonacci + secondLastFibonacci;
            secondLastFibonacci = lastFibonacci;
            lastFibonacci = current;
        }
        return lastFibonacci;
    }

    /**
     * This approach is better than naive recursion but still slower than iterative approach.
     * Memoization will prevent repeated subtrees by storing result, thus preventing duplicate subtrees.
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static int fibonacciByRecursiveMemoization(int n){
        int[] fibonacci = new int[51];
        Arrays.fill(fibonacci, -1);
        return fibonacciByRecursiveMemoization(n, fibonacci);
    }

    private static int fibonacciByRecursiveMemoization(int n, int[] fibonacci){
        if (n == 0 || n == 1) fibonacci[n] = n;
        if (fibonacci[n] != -1) return fibonacci[n];
        fibonacci[n] = fibonacciByRecursiveMemoization(n-1, fibonacci) + fibonacciByRecursiveMemoization(n-2, fibonacci);
        return fibonacci[n];
    }
}
