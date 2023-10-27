package dsa.recursion.factorials;

import java.util.ArrayList;
import java.util.List;

public class FirstNFactorials {

    /**
     * Time complexity: O(n^2)
     * Space complexity: O(n)
     */
    public static int[] firstNFactorials(int number){
        int i;
        int[] factorials = new int[number];

        for (i = 1; i < number; i++){
            int factorial = Factorial.factorialByLoop(i);
            if (factorial > number) return factorials;
            factorials[i-1] = factorial;
        }
        return factorials;
    }

    /**
     * Time complexity: O(n^2)
     * Space complexity: O(n)
     */
    public static List<Long> firstNFactorialsList(long number){
        int i;
        List<Long> factorials = new ArrayList<>();
        for (i = 1; i <= number; i++){
            long factorial = Factorial.factorialByLoop(i);
            if (factorial > number) return factorials;
            factorials.add(factorial);
        }
        return factorials;
    }

    /**
     * Time complexity: O(n): Reduced time complexity by getting next factorial by multiplication with last factorial.
     * Space complexity: O(n)
     */
    public static List<Long> firstNFactorialsOptimised(long number){
        List<Long> factorials = new ArrayList<>(List.of(1L));
        if (number == 1) return factorials;
        int i;
        for (i = 2; i <= number; i++){
            long factorial = i * factorials.get(i-2);
            if (factorial > number) return factorials;
            factorials.add(factorial);
        }
        return factorials;
    }

    /**
     * TODO: REVISIT This implementation
     * Time complexity: O(n): Reduced time complexity by getting next factorial by multiplication with last factorial.
     * Space complexity: O(n)
     */
    public static List<Long> firstNFactorialsSimplifiedOptimised(long number){
        List<Long> factorials = new ArrayList<>();
        long factorial = 1L, count = 1L;
        while (factorial <= number/count){
            factorial = factorial * count;
            count++;
            factorials.add(factorial);
        }
        return factorials;
    }
}
