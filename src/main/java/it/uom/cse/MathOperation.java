package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

    public static int sumOfPrimes(int n){
        int sum = 0;
        int i = 1;
        int j;

        int t = n;
        while(n!=0) {
            int count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum = sum + i;
                n--;
            }
            i++;
        }
        return sum;
    }
}
