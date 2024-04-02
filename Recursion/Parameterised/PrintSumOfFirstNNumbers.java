package Recursion.Parameterised;

import java.util.Scanner;

public class PrintSumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printSum(n,0);
    }

    private static void printSum(int n, int sum) {
        if(n<1) {
            System.out.println("Sum = "+sum);
            return;
        }
        printSum(n-1, sum+n);
    }
}
