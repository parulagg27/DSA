package dsa.maths.GCD;

public class GreatestCommonDivisor {

    /**
     * Time complexity: ~O(n1 % n2)
     * Space complexity: O(1)
     */
    public static int findGCDByDivisionTillRemainderZero(int n1, int n2) {
        if (n1 == 0) return n2;
        if (n2 == 0) return n1;

        int divident = Math.max(n1, n2);
        int divisor = Math.min(n1, n2);
        while (true) {
            int remainder = divident % divisor;
            if (remainder == 0) {
                break;
            }
            divident = divisor;
            divisor = remainder;
        }
        return Math.abs(divisor);
    }

    /**
     * Time complexity: O(n)
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
}
