package me.learn.scaler.intermediate.math;

import com.google.common.collect.Lists;
import utils.ToStringUtils;

import java.util.ArrayList;

public class MajorityElements {
    public static void main(String[] args) {
        MajorityElements m = new MajorityElements();
        ToStringUtils.toString(m.majorityElement(Lists.newArrayList(1,2,3,1,1)));
    }

    public int majorityElement(final ArrayList<Integer> a) {
        int[] A = a.stream().mapToInt(Integer::valueOf).toArray();
        int MC = A[0];
        int freq = 1;

        // Get Majority Candidate
        for(int i =1; i<A.length; i++){
            if(A[i] == MC){
                freq++;
            }else freq--;

            if(freq == 0){
                freq++;
                MC=A[i];
            }
        }

        // Verify Majority Candidate
        freq=0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] == MC){
                freq++;
            }
        }

        return freq;
    }
}
