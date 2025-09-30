package no4;

import java.util.Arrays;

public class IncreaseWithOne {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        StringBuilder sb = new StringBuilder();

        for (int i : arr) {
            sb.append(i);
        }

        int n = Integer.parseInt(sb.toString()) + 1;
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int k = n % 10;
            newArr[i] = k;
            n /= 10;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
