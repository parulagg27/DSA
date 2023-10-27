package dsa.recursion.factorials;

public class Factorial {

    public static int factorialByRecursion(int number){
        //Factorial of negative numbers is not defined.
        if (number <= 0) return 0;
        return factorial(number, 1);
    }

    public static int factorialByLoop(int number){
        if (number <= 0) return 0;
        int i, factorial = 1;
        for (i = 2; i <=number; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    private static int factorial(int number, int factorial){
        if (number == 1) return factorial;
        factorial = factorial * number;
        return factorial(number - 1, factorial);
    }
}
