package me.learn.scaler.intermediate.math;

import com.google.common.collect.Lists;
import utils.ToStringUtils;

import java.util.ArrayList;

public class MajorityNby3Elements {
    public static void main(String[] args) {
        MajorityNby3Elements m = new MajorityNby3Elements();
        ToStringUtils.toString(m.majorityElement1(Lists.newArrayList(1000727, 1000727, 1000641, 1000517, 1000212, 1000532, 1000727, 1001000, 1000254, 1000106, 1000405, 1000100, 1000736, 1000727, 1000727, 1000787, 1000105, 1000713, 1000727, 1000333, 1000069, 1000727, 1000877, 1000222, 1000727, 1000505, 1000641, 1000533, 1000727, 1000727, 1000727, 1000508, 1000475, 1000727, 1000573, 1000727, 1000618, 1000727, 1000309, 1000486, 1000792, 1000727, 1000727, 1000426, 1000547, 1000727, 1000972, 1000575, 1000303, 1000727, 1000533, 1000669, 1000489, 1000727, 1000329, 1000727, 1000050, 1000209, 1000109)));
    }

    public int majorityElement(final ArrayList<Integer> a) {
        int[] A = a.stream().mapToInt(Integer::valueOf).toArray();
        int MC1 = -1;
        int MC2 = -1;
        int freq1 = 0;
        int freq2 = 0;

        // Get Majority Candidate
        for(int i =0; i<A.length; i++){

            if(freq1 ==0 || A[i] ==MC1){
                MC1=A[i];
                freq1++;
            }else if(freq2 == 0 || A[i]== MC2){
                MC2=A[i];
                freq2++;
            } else {
                freq1--;
                freq2--;
            }

            if(freq1 == 0){
                MC1=-1;
            }
            if(freq2 ==0){
                MC2=-1;
            }

            System.out.println("A[i]: "+A[i]+" -- MC1 = "+MC1+", freq1: "+freq1+", MC2= "+MC2+", freq2= "+freq2);
        }

        // Verify Majority Candidate
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] == MC1){
                count1++;
            }else if(A[i] == MC2){
                count2++;
            }
        }

        if(count1>Math.floorDiv(A.length, 3)){
            return MC1;
        }

        if(count2>Math.floorDiv(A.length, 3)){
            return MC2;
        }

        return -1;
    }

    public int majorityElement1(final ArrayList<Integer> a) {
        int[] A = a.stream().mapToInt(Integer::valueOf).toArray();
        int MC1 = -1;
        int MC2 = -1;
        int freq1 = 0;
        int freq2 = 0;

        // Get Majority Candidate
        for(int i =0; i<A.length; i++){

            if( A[i] ==MC1){
                freq1++;
            }else if(A[i]== MC2){
                freq2++;
            }else if(freq1 ==0){
                MC1=A[i];
                freq1++;
            }else if(freq2 == 0 ){
                MC2=A[i];
                freq2++;
            } else {
                freq1--;
                freq2--;
            }

            System.out.println("A[i]: "+A[i]+" -- MC1 = "+MC1+", freq1: "+freq1+", MC2= "+MC2+", freq2= "+freq2);
        }

        // Verify Majority Candidate
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] == MC1){
                count1++;
            }else if(A[i] == MC2){
                count2++;
            }
        }

        if(count1>Math.floorDiv(A.length, 3)){
            return MC1;
        }

        if(count2>Math.floorDiv(A.length, 3)){
            return MC2;
        }

        return -1;
    }
}
