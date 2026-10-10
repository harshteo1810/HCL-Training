package collectionFramework;

import java.util.*;

public class Mapclass {
    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<>(); // doesn't preserve insertion order
        // Map<Integer,String> mp = new LinkedHashMap<>();// preserve insertion order
        // Map<Integer,String> mp = new TreeMap<>();// sort according to key 
        mp.put(1,"Harsh");
        mp.put(2,"Himanshu");
        mp.put(3,"Ankit");
        mp.put(4,"Vipin");
        mp.put(5,"Yashi");
        System.out.println(mp);
        if(mp.containsKey(5)){
            System.out.println("YES");
        }
        if (!mp.containsValue("Paul")) {
            System.out.println("No");
        }
        mp.forEach((k,v) -> System.out.println(k+":"+v));
    }
}