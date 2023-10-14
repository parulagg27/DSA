package dsa.maths.digitsInInteger;

public class DigitCounter {

    public static int countDigitsByBase10(int number){
        int quotient = number;
        int count = 0;

        if (number == 0){
            return 1;
        }
        while (quotient != 0){
            quotient = quotient/10;
            count++;
        }
        return count;
    }
}
