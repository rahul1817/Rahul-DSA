package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        System.out.println("Shikhar test");
        String str = sc.nextLine();
        charCount(str);
    }
    //RaRhul
    public static void charCount(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        char st[] = str.toCharArray();

        for (char c: st) {
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }

        }
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
