package lesson03;

import java.util.Scanner;
import java.math.BigDecimal;

  public  class Fibonacci {

        static BigDecimal a = new BigDecimal("1");
        static BigDecimal b = new BigDecimal("1");
        static BigDecimal c = new BigDecimal("0");
        static int i = 0;


        public static void printFibonacciNumbers(int k){
            if (i < k) {
                ++i;
                a = b;
                b = c;
                c = a.add(b);
                System.out.println(c);
                printFibonacciNumbers(k);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many numbers do you want ?");
            int n = scanner.nextInt();
            if (n==0 || n<0){
                System.out.println("Please enter a positive number more than 0");
            }
            else
                System.out.println("Result:\n" + "0");
                printFibonacciNumbers(n-1);
        }

    }


