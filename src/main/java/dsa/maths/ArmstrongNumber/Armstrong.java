package dsa.maths.ArmstrongNumber;

public class Armstrong {

    public static boolean determineArmstrongByDigitCount(int number) {
        if (number == 0 || number == 1) return true;
        int dividend = number;
        int count;

        for (count = 0; dividend != 0; count++){
            dividend = dividend / 10;
        }
        int sum = 0;
        dividend = number;
        while (dividend != 0) {
            int remainder = dividend % 10;
            sum = (int) (sum + Math.pow(remainder, count));
            dividend = dividend / 10;
        }
        return sum == number;
    }
}
