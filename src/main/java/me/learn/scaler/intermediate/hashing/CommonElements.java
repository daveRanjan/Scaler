package me.learn.scaler.intermediate.hashing;

import utils.ToStringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElements {
    public static void main(String[] args) {
        ToStringUtils.toString(new CommonElements().solve(new int[]{1, 2, 2, 1}, new int[]{2, 3, 1, 2}));
    }


    public int[] solve(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> sol = new ArrayList<>();
        // Calculate Frequency
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) +1);
        }

        for (int i = 0; i < B.length; i++) {
            Integer freq = map.get(B[i]);
            if(freq !=null && freq > 0){
                sol.add(B[i]);
                map.put(B[i], --freq);
            }
        }


        return sol.stream().mapToInt(Integer::valueOf).toArray();
    }
}
