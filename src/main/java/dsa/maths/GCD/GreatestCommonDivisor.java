package dsa.maths.GCD;

/**
 * GCD or HCF: largest positive number that can divide both the given numbers
 * This can be used to determine min. fraction for given fraction. Ex: 6/4 = (6/GCD(6,4)) / (4/GCD(6,4))
 */
public class GreatestCommonDivisor {

    /**
     * Time complexity: O(log(min(n1, n2)))
     * Space complexity: O(1)
     */
    public static int findGCDByDivisionTillRemainderZero(int n1, int n2) {
        if (n1 == 0) return n2;
        if (n2 == 0) return n1;

        while (true) {
            int remainder = n1 % n2;
            if (remainder == 0) {
                break;
            }
            n1 = n2;
            n2 = remainder;
        }
        return Math.abs(n2);
    }

    /**
     * This is same as findGCDByDivisionTillRemainderZero with simplified code, i.e.,
     * remainder is directly updated to n1, n2 instead of having new variable
     * Time complexity: O(log(min(n1, n2)))
     * Space complexity: O(1)
     */
    public static int findGCDByDivisionTillRemainderZeroV2(int n1, int n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;
        }
        if (n2 == 0) return n1;
        return n2;
    }

    /**
     * Time complexity: O(min(|n1|, |n2|))
     * Space complexity: O(1)
     */
    public static int findGCDByBruteForce(int n1, int n2) {
        if (n1 == 0) return n2;
        if (n2 == 0) return n1;

        int i;
        int gcd = 1;

        for (i = 1; i <= Math.abs(Math.min(n1, n2)); i++) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }

    /**
     * Time complexity: O(log(min(n1, n2))) - because min value means - max. number of divisions.
     * After one step, the larger number is reduced to roughly half of its original size and so on.
     * Space complexity: O(log(min(n1, n2))) - space taken in stackTrace for recursive call + space taken by base condition
     */
    public static int gcdByEuclideanFormula(int n1, int n2) {
        if (n2 == 0) return Math.abs(n1);
        //TODO: n1 > n2 comparison not needed since after first division, number gets swapped
        return gcdByEuclideanFormula(n2, n1 % n2);
    }
}
