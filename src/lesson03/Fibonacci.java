package lesson03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Fibonacci {
    public static void main(String[] args) {

        printFibonacciNumbers(-1);
        printFibonacciNumbers(0);
        printFibonacciNumbers(1);
        printFibonacciNumbers(4);
        printFibonacciNumbers(7);

    }

    public static void printFibonacciNumbers(int n) {
         BigDecimal a = new BigDecimal("0");
         BigDecimal b = new BigDecimal("1");

        ArrayList<BigDecimal> fibonacci = new ArrayList<BigDecimal>();
        fibonacci.add(a);
        fibonacci.add(b);
        if (n==0 || n<0){
            System.out.println("Please enter a positive number more than 0");
            return;
        }
        else if (n==1){
            System.out.println(fibonacci.get(0));
            return;
        }
        for (int i = 2; i <= n-1; i++) {
            fibonacci.add(fibonacci.get(i - 1).add( fibonacci.get(i-2)));
        }


        String commaSeparatedNumbers = fibonacci.stream()
                .map(i -> i.toString())
                .collect(Collectors.joining(", "));
        System.out.println(commaSeparatedNumbers);
    }
}