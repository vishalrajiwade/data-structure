/* Time Complexity : O(n)
 * Space Complexity : O(n)
 */
package Recursion.Basic;

import java.util.Scanner;

public class PrintFromNto1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumber(n, n);
    }

    private static void printNumber(int i, int n) {
        if(i<1) return;
        System.out.println(i);
        printNumber(i-1, n);
    }
    
}
