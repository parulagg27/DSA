package dsa.maths.GCD;

public class GreatestCommonDivisor {

    /**
     *
     * Time complexity: ~O(n1 % n2)
     * Space complexity: O(1)
     */
    public static int findGCDByDivisionTillRemainderZero(int n1, int n2) {
        if (n1 == 0 || n2 == 0){
            return 0;
        }
        int divident = Math.max(n1, n2);
        int divisor = Math.min(n1, n2);
        while (true){
            int remainder = divident % divisor;
            if (remainder == 0) {
                break;
            }
            divident = divisor;
            divisor = remainder;
        }
        return divisor;
    }
}
