package Hashing;

import java.util.HashMap;

public class Hash_map_operation {
    public static void main(String[] args) {
        // Create a hash map
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert key value pairs
        hm.put("Jabalpur", 150);
        hm.put("Bhopal", 200);
        hm.put("Seoni", 300);

        // print the hash map
        System.out.println("Hash map:" + hm);

        // get - o(1)
        int population = hm.get("Jabalpur");
        System.out.println("population of Jabalpur:" + population);

        // Contiains key - 0(1)
        if (hm.containsKey("Bhopal")) {
            System.out.println("Bhopal is present int the hash map");
        } else {
            System.out.println("Bhopal is not present in the hash map");
        }

        // remove - 0(1)
        System.out.println(hm.remove("Jabalpur"));
        System.out.println(hm);

    }
}
