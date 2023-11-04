package dsa.recursion.fibonacci;

public class Fibonacci {

    public static int fib(int n) {
        if (n == 0 || n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fibonacciByLoop(int n){
        if (n == 0 || n == 1) return n;
        int[] fibonacci = new int[n+1];
        int i;
        for (i = 0; i <= n; i++){
            if (i == 0) fibonacci[i] = 0;
            else if (i == 1) fibonacci[i] = 1;
            else fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci[n];
    }

    public static int fibonacciWithMemoizationAndMemoryOptimisation(int n){
        if (n == 0 || n == 1) return n;
        int secondLastFibonacci = 0;
        int lastFibonacci = 1;
        for (int i = 2; i <= n; i++){
            int temp = lastFibonacci + secondLastFibonacci;
            secondLastFibonacci = lastFibonacci;
            lastFibonacci = temp;
        }
        return lastFibonacci;
    }
}
