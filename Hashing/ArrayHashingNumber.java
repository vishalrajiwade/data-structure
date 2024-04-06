/* This is Array Hashing - Number Program with a constraint when array
 * element will be at max 12, therefore we created hash[13] so we can store the 
 * frequency of number 12 at the arr[12]
 * 
 * Time Complexity : O(Q*N)
 */ 


package Hashing;

import java.util.Scanner;

public class ArrayHashingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Main Array declaration
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Main array elements insertion
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //iteration over Main Array
        for(int item : arr){
            System.out.print(item + " : ");
        }

        //pre-comute
        int[] hash = new int[13];
        for(int j=0; j<n; j++){
            hash[arr[j]] += 1;
        }

        //query number
        int q = sc.nextInt();
        while(q-- >0){
            int number = sc.nextInt();

            //fetching
            System.out.println("Number : " +number+ " -> "+hash[number]);

        }
    }

    
}
