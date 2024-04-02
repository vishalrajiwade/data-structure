/*Time Complexity : O(n/2)
 * Space Complexity : O(n/2)
 */

package Recursion;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] strChar = str.toCharArray();
        System.out.println(isPalindrome(0, strChar, strChar.length)); 
    }

    private static boolean isPalindrome(int i, char[] strChar, int size) {
        if(i >= size/2) return true;
        if(strChar[i] != strChar[size-i-1]) return false;
        return isPalindrome(i+1, strChar, size);
    }
}
