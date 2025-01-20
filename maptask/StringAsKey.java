package com.xworkz.features.maptask;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringAsKey {
    public static void main(String[] args) {
        Map<String,Integer> list = new HashMap<>();
        list.put("a",101);
        list.put("b",201);
        list.put("ab",301);
        list.put("abc",401);
        System.out.println("***********Using Set and forEach()**************");
        Set<Map.Entry<String, Integer>> entries = list.entrySet();
        for(Map.Entry<String, Integer> entry:entries) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }
}
