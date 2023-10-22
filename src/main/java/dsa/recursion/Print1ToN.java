package dsa.recursion;

public class Print1ToN {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static int[] get1ToN(int n){
        int[] numbers = new int[n];
        return get1ToN(n, numbers);
    }

    private static int[] get1ToN(int n, int[] numbers){
        if (n < 1) return numbers;
        numbers[n-1] = n;
        return get1ToN(n-1, numbers);
    }
}
