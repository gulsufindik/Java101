package com.gulsufindik;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
        Random rand = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < 10000; i++) {
            int num = rand.nextInt(100) + 1;
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }
        
        System.out.println(map); 
    }
}