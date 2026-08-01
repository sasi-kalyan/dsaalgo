package problems;

public class LargestElement {

    /*
        * Problem Statement: Given an integer array, find the largest element present in the array.
        * Time Complexity: O(n)
        * Space Complexity: O(1)
     */
    public static int largestElement(int[] arr, int n){

        if(arr.length == 0) return -1;

        int max = arr[0];

        for(int i = 1; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56};

        int max = largestElement(arr, arr.length);
        System.out.println("largest element in the array: "+ max);
    }
}
