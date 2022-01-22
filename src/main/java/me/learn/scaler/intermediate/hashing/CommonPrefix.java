package me.learn.scaler.intermediate.hashing;

import utils.ToStringUtils;

public class CommonPrefix {

    public static void main(String[] args) {
        CommonPrefix cp = new CommonPrefix();
        ToStringUtils.toString(cp.longestCommonPrefix(new String[]{"abcd", "abcd", "efgh"}));
    }

    public String longestCommonPrefix(String[] A) {
        String s = "";
        boolean subs = true;
        int k =0;
        while(subs){
            char ch = A[0].charAt(k);
            for(int i=1; i< A.length; i++){
                if(A[i].charAt(k) != ch){
                    return s;
                }
            }
            k++;
            s=s+ch;
        }

        return s;

    }
}
