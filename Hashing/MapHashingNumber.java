package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class MapHashingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Pre-Compute
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int item : arr){
            int key = item; 
            int freq = 0; 
            if(map.containsKey(key)) {
                freq = map.get(key) + 1;
            } else {
                freq +=1;
            }
            map.put(key, freq);
        }

        int q = sc.nextInt();
        while(q-- >0){
            int number = sc.nextInt();
            //Fetching
            System.out.println(map.containsKey(number) ? map.get(number) : 0);
        }    
    }
}
