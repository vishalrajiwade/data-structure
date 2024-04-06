/* Time Complexity : O(n^2) for worst case and average case
 * O(n) for best case
 */
package Sorting.BubbleSort;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        bubbleSort(arr, n);
        System.out.println("After sorting :");
        for(int item : arr){
            System.out.print(item + " ");
        }
    }

    private static void bubbleSort(int[] arr, int n) {
        for(int i=n-1; i>=1; i--){
            boolean didSwap = false; 
            for(int j=0; j<=i-1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = true;
                }
            }
            if(!didSwap) break;
            // System.out.println("Runs");
        }      
    }
}
