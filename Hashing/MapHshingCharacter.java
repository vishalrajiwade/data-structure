package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class MapHshingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //Pre-Compute
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            Character key = str.charAt(i); 
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
            Character c = sc.next().charAt(0);
            //Fetching
            System.out.println(map.containsKey(c) ? map.get(c) : 0);
        }    
    }
}
