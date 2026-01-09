package Hashing;

import java.util.HashMap;
import java.util.Set;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 120);
        hm.put("China", 150);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 50);

        // Iterating over the hash map
        Set<String> Keys = hm.keySet();
        System.out.println("Keys:" + Keys);

        for (String K : Keys) {
            System.out.println(" Key = " + K + "  ,  value= " + hm.get(K));
        }
    }
}
