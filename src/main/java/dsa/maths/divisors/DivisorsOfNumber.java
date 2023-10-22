package dsa.maths.divisors;

import java.util.ArrayList;
import java.util.List;

public class DivisorsOfNumber {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n) [due to array]
     * Limitation: Will lead to unused allocated memory for smaller input. And index out of bound for larger input due to fixed size array
     */
    public static int[] getDivisorsByBruteForce(int number) {
        if (number == 0) return new int[]{0};
        int[] divisors = new int[number / 2];
        int i = 0, j;

        for (j = 1; j <= number; j++) {
            if (number % j == 0 && i < divisors.length) {
                divisors[i] = j;
                i++;
            }
        }
        return divisors;
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n) [due to array]
     */
    public static List<Integer> getDivisorsUsingArrayList(int number) {
        if (number == 0) return List.of(0);
        ArrayList<Integer> divisors = new ArrayList<>();
        int j;
        for (j = 1; j <= number; j++) {
            if (number % j == 0) {
                divisors.add(j);
            }
        }
        return divisors;
    }

    /**
     * Approach: Root of a number acts as a splitting part of all the divisors of a number.
     * And quotient of a division by one of the divisors is also a divisor.
     * Time complexity: O(sqrt(n))
     * Space complexity: O(n) [due to array]
     */
    public static List<Integer> getDivisorsBySquareRoot(int number) {
        if (number == 0 || number == Integer.MIN_VALUE) return List.of(0);
        int absNumber = Math.abs(number);
        List<Integer> divisors = new ArrayList<>();
        int divisor;
        for (divisor = 1; divisor * divisor <= absNumber; divisor++) {
            if (absNumber % divisor == 0) {
                divisors.add(divisor);
                if (absNumber / divisor != divisor) {
                    //edge case for perfect square where only 1 number to be added
                    divisors.add(absNumber / divisor);
                }
            }
        }
        return divisors;
    }

    //TODO: Add prime factorisation approach to find count and sum of divisors
}
