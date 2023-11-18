package dsa.recursion;

public class Sum1ToN {

    public static int sumTillNViaRecursion(int number) {
        int sum = 0;
        if (number < 0) return sum;
        return sumTillN(number, sum);
    }

    public static int sumOfN(int number) {
        return number * (number + 1) / 2;
    }

    private static int sumTillN(int number, int sum) {
        if (number < 1) return sum;
        return sumTillN(number - 1, sum + number);
    }
}
