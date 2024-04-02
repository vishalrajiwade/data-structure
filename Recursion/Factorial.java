/* Time Complexity : O(n)
 * Space Complexity : O(n) 
 */

package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Factorial of "+n+ " = : " +factorial(n));
        scanner.close();
    }

    private static int factorial(int n) {
        if(n==1) return 1;
        return n * factorial(n-1);
        
    }
}
/*Note : if we use base case as n == 0, then factorial function will return 0 as 
 *       we are multiplying with 0, therefore base condition is n == 1
 */