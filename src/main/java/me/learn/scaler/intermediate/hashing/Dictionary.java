package me.learn.scaler.intermediate.hashing;

import utils.ToStringUtils;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Dictionary d = new Dictionary();
//        ToStringUtils.toString(d.solve(new String[]{ "hello", "scaler", "interviewbit"}, "adhbcfegskjlponmirqtxwuvzy"));
        ToStringUtils.toString(d.solve(new String[]{"fine", "none", "no"}, "qwertyuiopasdfghjklzxcvbnm"));
    }

    public int solve(String[] A, String B) {
        CustomComparator comparator = new CustomComparator(B);
        String[] ASorted =A.clone();
        Arrays.sort(ASorted, comparator);
        return Arrays.deepEquals(A, ASorted) ? 1 : 0;

    }

    class CustomComparator implements Comparator<String> {
        private Map<Character, Integer> charMap = new HashMap<>();

        public CustomComparator(String C) {
            char[] chars = C.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                charMap.put(chars[i], i);
            }
        }


        @Override
        public int compare(String str1, String str2) {
            int l1 = str1.length();
            int l2 = str2.length();
            int i = 0;
            int j = 0;

            while (i < l1 && j < l2){
                int res = Integer.compare(charMap.get(str1.charAt(i)), charMap.get(str2.charAt(j)));
                if(res == 0){
                    i++; j++;
                }else return res;
            }

            if(i == l1 && j!=l2){
                return -1;
            }else if (j==l2 && i !=l1){
                return 1;
            }else return 0;
        }
    }

}
