/* This is Array Hashing - Character Program 
 * 1. When string contains only lowercase letters -> hash[26]
 * 2. when string contains only capital letters -> hash[26]
 * 3. when string contains both capital and lower letters -> hash[256]
 * Time Complexity : O(Q*N)
 */ 

package Hashing;

import java.util.Scanner;

public class ArrayHashingCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();

        lowerStringHashing(str.toLowerCase(), q);
        upperStringHashing(str.toUpperCase(), q);
        lowerAndUpperStringHashing(str, q);
    }

    private static void lowerAndUpperStringHashing(String str, int q) {
        Scanner sc = new Scanner(System.in);

        //Pre-Compute
        int[] hash = new int[256];
        for(int i=0; i<str.length(); i++){
            hash[str.charAt(i)] +=1;
        }
        System.out.println("Lower and Upper");
        while(q-- >0){
            char c = sc.next().charAt(0);
            //Fetching
            System.out.println(c+ " -> "+hash[c]);

        }      
    }

    private static void upperStringHashing(String upperCase, int q) {
        Scanner sc = new Scanner(System.in);

        //Pre-Comute
        int[] hash = new int[26];
        for(int i=0; i<upperCase.length(); i++){
            hash[upperCase.charAt(i) - 'A'] +=1;
        }
        System.out.println("Upper");
        while(q-- >0){
            char c = sc.next().charAt(0);
            //Fetching
            System.out.println(Character.toUpperCase(c)+ " -> "+hash[Character.toUpperCase(c) - 'A']);
        }
    }

    private static void lowerStringHashing(String lowerStr, int queryLength) {
        Scanner sc = new Scanner(System.in);
        // a->0, b->1, c->3 ... z->25
        //Pre-Storing
        int[] hash = new int[26];
        for(int i=0; i<lowerStr.length(); i++){
            hash[lowerStr.charAt(i) - 'a'] += 1;
        }

        System.out.println("Lower");
        while(queryLength-- >0){
            char c = sc.next().charAt(0);

            //Fetching
            // Character.toLowerCase(c) : used this because if user put upper letter for query then it will throw ArrayIndexOutOfBoundException
            System.out.println(Character.toLowerCase(c)+" -> "+hash[Character.toLowerCase(c) - 'a']);
        }
        
    }
    
}
