package com.xworkz.features.maptask;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntegerAsKey {
    public static void main(String[] args) {
        Map<Integer,Integer> list = new HashMap<>();
        list.put(10,1099);
        list.put(4,567);
        list.put(23,9087);
        list.put(20,6789);
        Set<Map.Entry<Integer, Integer>> entries = list.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries){
            System.out.println(entry);
        }

    }
}
