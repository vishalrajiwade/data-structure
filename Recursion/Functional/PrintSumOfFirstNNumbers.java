package Recursion.Functional;

import java.util.Scanner;

public class PrintSumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Sum = " +printSum(n)); 
    }

    private static int printSum(int n) {
        if(n==1) return 1;
        return n +  printSum(n-1);
    }
}
