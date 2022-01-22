package me.learn.scaler.intermediate.hashing;

import utils.ToStringUtils;

import java.util.HashMap;
import java.util.Map;

public class LargestSumArrayWithSumZero {
    public static void main(String[] args) {
        ToStringUtils.toString(new LargestSumArrayWithSumZero().solve(new int[]{-19, 8, 2, -8, 19, 5, -2, -23}));
    }


    public int[] solve(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int size = Integer.MIN_VALUE;
        int index = -1;
        // Step1:- Calculate PF Array
        int[] pf = new int[A.length];
        pf[0]=A[0];

        for (int i = 1; i < A.length; i++) {
            pf[i]=pf[i-1]+A[i];
        }

        for (int i = 0; i < pf.length; i++) {
            Integer val = map.get(pf[i]);
            if(val != null){
                if((i-val) > size){
                    index = val + 1;
                    size = (i-val);
                }else if((i-val) == size && index > val){
                    index = val + 1;
                }
            }else map.put(pf[i], i);
        }

        int[] sol = new int[size];

        for (int i = index, j=0;  i < size+index; i++, j++) {
            sol[j]=A[i];
        }
        return sol;
    }
}
