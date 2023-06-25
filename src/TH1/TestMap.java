package TH1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",31);
        hashMap.put("Mike",29);
        hashMap.put("Leon",29);
        System.out.println("Hash map: "+hashMap);
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Tree map: "+treeMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Cook",29);
        System.out.println("Linked HashMap: "+linkedHashMap);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
