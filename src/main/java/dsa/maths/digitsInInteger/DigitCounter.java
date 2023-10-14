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

    public static int countDigitsByLog(int number){
        int absoluteNumber = Math.abs(number);

        if(absoluteNumber == 0){
            return 1;
        }
        //formula: log10(n) + 1
        return (int) Math.floor(Math.log10(absoluteNumber)) + 1;
    }

    public static int countDigitsByStringConversion(Integer number){
        //to avoid calculating - sign as another character
        int absNumber = Math.abs(number);
        String stringNumber = Integer.toString(absNumber);
        return stringNumber.length();
    }
}
