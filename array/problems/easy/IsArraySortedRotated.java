package problems.easy;

public class IsArraySortedRotated {

    public static boolean isArraySortedRotated(int[] arr, int n){

        if(arr.length == 0) return true;

        int count = 0;
        for(int i = 0; i < n - 1; i++){

            if(arr[i] > arr[i + 1]) count++;
        }

        if(count == 0)
            return true;
        if(count == 1 && arr[0] >= arr[n - 1])
            return true;

        return false;
    }

    public static void main(String[] args) {
        //int[] arr = {3, 4, 5, 1, 2};
        int[] arr = {2, 1, 3, 4};
        boolean val = isArraySortedRotated(arr, arr.length);
        System.out.println("is array sorted and rotated? "+ val);
    }
}
