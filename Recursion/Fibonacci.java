/* Fibonacci Series : 0 1 1 2 3 5 8 13 21 34 ...
              Index : 0 1 2 3 4 5 6 7  8  9 

    Time Complexity  :  Near about O(2^n) Exponential
    Space Complexity :  Near about O(2^n) Exponential          
 */ 
package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n)); 
    }

    private static int fibonacci(int n) {
        if(n<=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
