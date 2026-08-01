package problems;

public class SecondLargestElement {

    /*
        * PS: Given an integer array, find the second largest distinct element.
        * Time Complexity: O(n)
        * Space Complexity: O(1)
     */
    public static int secondLargest(int[] arr, int n){

        if(arr.length == 0) return -1;

        int fmax = arr[0], smax = -1;

        for(int i = 1; i < n; i++){

            if(fmax < arr[i] && fmax != smax){
                smax = fmax;
                fmax = arr[i];
            } else if (smax < arr[i] && arr[i] != fmax) {
                smax = arr[i];
            }
        }

        return smax;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 30, 40};

        int smax = secondLargest(arr, arr.length);
        System.out.println("second largest : "+ smax);
    }
}
