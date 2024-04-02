package Recursion.Basic;

import java.util.Scanner;

public class PrintNTo1Backtrack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumber(1,n);
    }

    public static void printNumber(int i, int n){
        if(i>n) return;
        printNumber(i+1, n);
        System.out.println(i);
    }
}
