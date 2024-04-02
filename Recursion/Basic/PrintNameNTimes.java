/* Time Complexity : O(n)
 * Space Complexity : O(n)
 */

package Recursion.Basic;

import java.util.Scanner;

public class PrintNameNTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printName(1,n);
    }

    private static void printName(int i, int n) {
        if(i>n) return;
        System.out.println("Vishal");
        /* Note : Previously for function call, I used i++ but it went into 
                  indefinite function calls. because it was written as post increment.
                  I changed i++ to i+1 and ran successfully.
                  We can also used ++1 as a parameter.
        */
        printName(++i, n);
    } 

}
