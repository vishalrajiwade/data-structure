/* Time Complexity : O(n)
 * Space Complexity : O(n)
 */
package Recursion.Basic;

import java.util.Scanner;

public class PrintFrom1ToN {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumber(1, n);
    }

    public static void printNumber(int i, int n){
        if(i>n) return;
        System.out.println(i);
        printNumber(i+1, n);
    }

}
