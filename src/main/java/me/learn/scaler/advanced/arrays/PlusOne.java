package me.learn.scaler.advanced.arrays;

import utils.ToStringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne= new PlusOne();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList( 0, 3, 7, 6, 4, 0, 5, 5, 5));
        ToStringUtils.toString(plusOne.plusOne(input));
    }

    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int N = A.size();
        int carry=-1;
        int i = N-1;

        //Remove trailing zeros
        ListIterator<Integer> it = A.listIterator();
        while (it.hasNext() && it.next() == 0) {
            it.remove();
        }

        while(carry !=0 && i >=0){
            int M = A.get(i);
            if((M+1) > 9){
                carry=1;
                A.set(i, (M+1)%10);
                if(i==0 && carry==1){
                    A.add(0,carry);
                }
                i--;
            }else {
                A.set(i, (M+1)%10);
                carry=0;
            };
        }

        return A;
    }
}
