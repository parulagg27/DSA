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
        return divisors.equals(List.of(1, number));
    }

    /**
     * Time complexity: O(sqrt(n)):  better than 99.35% users on coding ninjas
     * Space complexity: O(1): better than 98.16% users on coding ninjas
     */
    public static boolean isPrimeByOnlyCheckingIfRemainderZero(int number){
        //number 0,1: neither prime, nor composite
        if (number <= 1) return false;
        int i;
        for (i = 2; i * i <= number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * This approach skips checking for unnecessary numbers that are not prime. If number divisible by 2 & 3 -> Not prime. So all checks with 2 & 3 multiples are skipped.
     * Any prime number other than 2,3 can be represented as: coprime pair: (6k-1), (6k+1) where k = (1:n). Ex: (5.7), (11, 13), (17, 19), (23), (29, 31),... so on.
     * Checks before n = 25 -> skipped since i^2 > n. So prime = true returned.
     * All multiples of prime numbers, ex: 25, 49, etc. are declared non-prime inside internal if condition.
     * Time complexity: O(sqrt(n)/3) -> Theoretically same as Sqrt(n) approach, but 3X faster, as unnecessary checks reduced by 3times.
     * Space complexity: O(1)
     */
    public static boolean isPrimeByRuleOf6Algorithm(int number){
        if (number == 2 || number == 3) return true;
        if (number <= 1 || number % 2 == 0 || number % 3 == 0) return false;
        int i;
        for (i = 5; i * i <= number; i += 6){
            if ((number % i == 0) || (number % (i + 2) == 0)){
                return false;
            }
        }
        return true;
    }
}
