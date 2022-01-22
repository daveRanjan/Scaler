package me.learn.scaler.intermediate.recursion;

import utils.ToStringUtils;

import java.util.ArrayList;

public class GreyCode {
    public static void main(String[] args) {
        GreyCode sol = new GreyCode();
        ToStringUtils.toString(sol.greyCode(3));

    }

    public ArrayList<Integer> greyCode(int a) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        return myGreyCode(0,a,result);
    }

    public ArrayList<Integer> myGreyCode(int i, int a , ArrayList<Integer> result){
        if(i == a){
            return  result;
        }

        for (int j = result.size()-1; j >= 0; j--) {
            result.add(result.get(j) + (int) Math.pow(2,i));
        }

        return myGreyCode(++i, a, result);
    }


}
