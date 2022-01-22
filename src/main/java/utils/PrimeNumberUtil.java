package utils;

public class PrimeNumberUtil {

    public static int[] createSeieveArray(int A){
        int[] s = new int[A];

        for (int i = 0; i < A; i++) {
            s[i]=i;
        }

        for (int i = 2; i * i < A; i++) {
            // set all integers to number itself for above numbers
            for (int j = i; j * i < A; j++) {
                s[j*i] = 0;
            }
        }

        ToStringUtils.toString(s);

        return s;
    }
}
