package me.learn.scaler.intermediate.hashing;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(new Palindrome().solve("abbaee"));
    }


    public int solve(String A) {
        char[] chars = A.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            hm.put(chars[i], hm.getOrDefault(chars[i], 0) + 1);
        }

        int odd = 0;
        for (Integer freq : hm.values()) {
            if (freq % 2 != 0) odd++;
        }

        if (odd > 1) return 0;

        return 1;
    }
}
