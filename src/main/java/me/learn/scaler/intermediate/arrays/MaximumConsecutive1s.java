package me.learn.scaler.intermediate.arrays;

public class MaximumConsecutive1s {

    public static void main(String[] args) {
        MaximumConsecutive1s m = new MaximumConsecutive1s();
        System.out.println(m.solve("111011101"));
    }

    private int solve(String A) {
        char[] arr = A.toCharArray();
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int ans = 0;
        int left1 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]=='0'){
                left[i]=left1;
                left1=0;
            }else left1++;
        }

        int right1 = 0;
        for(int i = arr.length-1; i >=0; i--){
            if(arr[i]=='0'){
                right[i]=right1;
                right1=0;
            }else right1++;
        }
        int all1 = 0;
        for(int i =0; i < arr.length ; i++){
            if(left[i] >0 && right[i] >0){
                ans = Math.max(left[i]+right[i]+1, ans);
            }else ans = Math.max(left[i]+right[i], ans);

            if(arr[i] == '1'){
                all1++;
            }
        }

        if(all1 == arr.length){
            return  all1;
        }

        return ans;
    }
}
