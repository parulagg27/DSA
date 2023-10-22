package dsa.maths.primeNumbers;

import dsa.maths.divisors.DivisorsOfNumber;

import java.util.List;

/**
 * A prime number is a 'natural' number greater than 1 with only two factors –  1 and the number itself.
 */
public class PrimeNumber {

    /**
     * Time complexity: O(sqrt(n))
     * Space complexity: O(n) due to storage in array
     */
    public static boolean isPrime(int number){
        if (number <= 1) return false;
        List<Integer> divisors = DivisorsOfNumber.getDivisorsBySquareRoot(number);
        System.out.println(divisors);
        return divisors.equals(List.of(1, number));
    }

    /**
     * Time complexity: O(sqrt(n)):  better than 99.35% users on coding ninjas
     * Space complexity: O(1): better than 98.16% users on coding ninjas
     */
    public static boolean isPrimeByOnlyCheckingIfRemainderZero(int number){
        if (number <= 1) return false;
        int i;
        for (i = 2; i * i <= number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
