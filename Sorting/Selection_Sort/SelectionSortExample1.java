/* Time Complexity : O(n^2) for best, average and worst case
 */
package Sorting.Selection_Sort;

import java.util.Scanner;

public class SelectionSortExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        selectionSort(arr, n);
        for(int item : arr){
            System.out.print(item + " ");
        }
    }

    private static void selectionSort(int[] arr, int n) {
        for(int i=0; i<= n-2; i++){
            int minIndex = i;
            for(int j=i; j<= n-1; j++){
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }   

}
