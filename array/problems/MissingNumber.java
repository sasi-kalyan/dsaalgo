package problems;

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] arr){

        int n = arr[arr.length - 1];

        int tsum = (n * (n+1))/2;
        int sum = Arrays.stream(arr).sum();

        return Math.abs(tsum - sum);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6};
        System.out.println("missing number: "+ missingNumber(arr));
    }
}
