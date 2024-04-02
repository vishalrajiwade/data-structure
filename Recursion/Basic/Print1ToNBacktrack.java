package Recursion.Basic;

import java.util.Scanner;

public class Print1ToNBacktrack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumber(n,n);
    }

    public static void printNumber(int i, int n){

        if(i<1) return;
        printNumber(i-1, n);
        System.out.println(i);

    }

}
