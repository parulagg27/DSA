package dsa.recursion;

public class Numbers1ToN {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static int[] get1ToN(int n){
        int[] numbers = new int[n];
        return get1ToN(n, numbers);
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static int[] getNto1(int x) {
        int[] reverseNumbers = new int[x];
        return getNto1(x, reverseNumbers);
    }

    private static int[] get1ToN(int n, int[] numbers){
        if (n < 1) return numbers;
        numbers[n-1] = n;
        return get1ToN(n-1, numbers);
    }

    private static int[] getNto1(int x, int[] reversedNumbers){
        if (x < 1) return reversedNumbers;
        reversedNumbers[reversedNumbers.length - x] = x;
        return getNto1(x-1, reversedNumbers);
    }
}
