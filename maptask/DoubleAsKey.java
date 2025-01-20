package com.xworkz.features.maptask;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DoubleAsKey {
    public static void main(String[] args) {
        Map<Double,String> list = new HashMap<>();
        list.put(90.89,"Keerthi");
        list.put(90.80,"Keerthi");
        list.put(87.80,"Kiran");
        list.put(68.90,"Usha");
        list.put(10.90,"Ramesh");
        Set<Map.Entry<Double, String>> entries = list.entrySet();
        for (Map.Entry<Double, String> entry : entries){
            System.out.println(entry);
        }

    }
}
