package dsa.maths.reverseInteger;

/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
*/
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

    //TODO: better approach as number formation from digits automatically handles negative value scenario
    public static int reverseNumberByModulus10AndNumberFormation(int number) {
        int quotient = number;
        int reversedNumber = 0;

        if (number == 0) {
            return 0;
        }

        while(quotient != 0) {
            int remainder = quotient % 10;
            quotient = quotient / 10;
            if (reversedNumber >= Integer.MAX_VALUE || reversedNumber <= Integer.MIN_VALUE){
                return 0;
            }
            reversedNumber = (reversedNumber * 10) + remainder;
        }
        return reversedNumber;
    }
}
