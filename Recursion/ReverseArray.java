package Recursion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        reverseArray(0, arr, n);
        for(int item : arr){
            System.out.println(item);
        }
    }

    private static void reverseArray(int i, int[] arr, int n) {
       if(i >= n/2) return;
       swap(i, n-i-1, arr);
       reverseArray(i+1, arr, n);
    }

    private static void swap(int i, int j, int[] arr) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i]= arr[i] - arr[j];
    }
}
