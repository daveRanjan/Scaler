package me.learn.scaler.intermediate.hashing;

import utils.ToStringUtils;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        SubarrayWithGivenSum s = new SubarrayWithGivenSum();
        ToStringUtils.toString(s.solve(new int[]{1, 2, 3, 4, 5}, 5));
    }
    public int[] solve(int[] A, int B) {
        int[] result = null;
        for(int i =0; i < A.length; i++){
            int sum = 0;
            for(int j = i; j<A.length; j++){
                sum+=A[j];
                if(sum == B){
                    result = new int[j-i+1];
                    for(int k =0; k<(j-i+1);k++){
                        result[k]=A[k+i];
                    }
                    return result;
                }else if(sum > B) break;
            }
        }

        return new int[]{-1};
    }
}
