package me.learn.scaler.intermediate.string;

import utils.ToStringUtils;

public class ReverseWordByWord {
    public static void main(String[] args) {
        ReverseWordByWord rw = new ReverseWordByWord();
        ToStringUtils.toString(rw.solve("Hi My Name is Dave"));
    }

    public String solve(String A) {
        char[] arr = A.trim().toCharArray();
        int N = arr.length;
        Character temp = null;
        reverse(arr, 0, N-1);
        int p1=0;
        int p2 = 0;
        for (int i = 0; i < N-1; i++) {
            if(arr[i]==' '){
                p2=i-1;
                reverse(arr, p1, p2);
                p1=i+1;
            }
        }

        reverse(arr, p1, N-1);


        return new String(arr);
    }

    public void reverse(char[] arr, int i , int j){
        Character temp = null;
        while (i<j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }

    }
}
