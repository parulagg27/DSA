package dsa.maths.reverseInteger;

public class DigitReversal {

    public static int reverseNumberByModulus10AndStringConcat(int number) {
        String reversedNumber = "";
        boolean isNegativeInt = false;
        if (number == 0 || number == Integer.MIN_VALUE || number == Integer.MAX_VALUE) {
            return 0;
        }
        if (number < 0) {
            isNegativeInt = true;
        }
        int quotient = Math.abs(number);
        while (quotient != 0) {
            int remainder = quotient % 10;
            quotient = quotient / 10;;
            reversedNumber = reversedNumber.concat(String.valueOf(remainder));
        }

        int parsedReversedNumber = Integer.parseInt(reversedNumber);
        return isNegativeInt ? -parsedReversedNumber : parsedReversedNumber;
    }
}
